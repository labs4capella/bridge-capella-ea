/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.artal.capella.bridge.core.services;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.osgi.util.tracker.ServiceTracker;

import com.artal.capella.bridge.core.MappingActivator;

public final class OsgiServiceTrackerUtils {

	public static <T> T getService(Class<T> clazz) {
		ServiceTracker<T, T> tracker = new ServiceTracker<>(MappingActivator.getBundleContext(), clazz, null);
		try {
			tracker.open();
			return tracker.getService();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			tracker.close();
		}

	}

	public static <T> List<T> getServices(Class<T> clazz) {
		if (MappingActivator.getBundleContext() != null) {
			ServiceTracker<T, T> tracker = new ServiceTracker<>(MappingActivator.getBundleContext(), clazz, null);
			try {
				tracker.open();
				@SuppressWarnings("unchecked")
				T[] services = tracker.getServices((T[]) Array.newInstance(clazz, 1));
				if (services.length == 1 && services[0] == null) {
					return new ArrayList<T>();
				}
				return Arrays.asList(services);
			} catch (Exception e) {
				throw new RuntimeException(e);
			} finally {
				tracker.close();
			}
		}
		return new ArrayList<T>();
	}

}
