// Copyright 2014 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.google.devtools.build.lib.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Objects;

/**
 * Tests for {@link Pair}.
 */
@RunWith(JUnit4.class)
public class PairTest {

  @Test
  public void constructor() {
    Object a = new Object();
    Object b = new Object();
    Pair<Object, Object> p = Pair.of(a, b);
    assertSame(a, p.first);
    assertSame(b, p.second);
    assertEquals(Pair.of(a, b), p);
    assertEquals(Objects.hash(a, b), p.hashCode());
  }

  @Test
  public void nullable() {
    Pair<Object, Object> p = Pair.of(null, null);
    assertNull(p.first);
    assertNull(p.second);
    p.hashCode(); // Should not throw.
    assertEquals(p, p);
  }
}
