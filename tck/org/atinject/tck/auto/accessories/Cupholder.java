/*
 * Copyright (C) 2009 The JSR-330 Expert Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.atinject.tck.auto.accessories;

import org.atinject.tck.auto.Seat;

import javax.inject.Inject2;
import javax.inject.Provider2;
import javax.inject.Singleton2;

@Singleton2
public class Cupholder {

    public final Provider2<Seat> seatProvider;

    @Inject2
    public Cupholder(Provider2<Seat> seatProvider) {
        this.seatProvider = seatProvider;
    }
}
