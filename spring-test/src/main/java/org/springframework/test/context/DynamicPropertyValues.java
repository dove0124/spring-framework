/*
 * Copyright 2002-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.test.context;

import java.util.function.Supplier;

/**
 * Functional interface used with {@link DynamicPropertySource @DynamicPropertySource}
 * annotated methods so that they can add properties that have dynamically
 * supplied values.
 *
 * @author Phillip Webb
 * @author Sam Brannen
 * @since 5.2.5
 */
@FunctionalInterface
public interface DynamicPropertyValues {

	/**
	 * Add a new property with a dynamically supplied value.
	 * @param name the name of the property to add
	 * @param valueSupplier a supplier that will provide the value lazily on demand
	 */
	void add(String name, Supplier<Object> valueSupplier);

}
