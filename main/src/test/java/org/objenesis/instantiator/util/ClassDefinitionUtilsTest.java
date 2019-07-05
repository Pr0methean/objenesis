/*
 * Copyright 2006-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.objenesis.instantiator.util;

import org.junit.Test;
import org.objenesis.Objenesis;

import static org.junit.Assert.*;

/**
 * @author Henri Tremblay
 */
public class ClassDefinitionUtilsTest {

   private final String className = "org.objenesis.EmptyClassBis";

   @Test
   public void testDefineClass() throws Exception {
      byte[] b = ClassDefinitionUtils.readClass(className);
      Class<?> c = ClassDefinitionUtils.defineClass(className, b, Objenesis.class, getClass().getClassLoader());
      assertEquals(c.getName(), className);
   }

}