/*
 * Copyright (C) 2014 Indeed Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
 package com.indeed.flamdex.fieldcache;

import com.indeed.util.core.io.Closeables2;
import com.indeed.flamdex.api.IntValueLookup;
import com.indeed.util.mmap.IntArray;
import com.indeed.util.mmap.MMapBuffer;
import org.apache.log4j.Logger;

/**
 * @author jsgroth
 */
public final class MMapIntArrayIntValueLookup implements IntValueLookup {
    private static final Logger LOG = Logger.getLogger(MMapIntArrayIntValueLookup.class);

    private final MMapBuffer buffer;
    private final IntArray intArray;

    public MMapIntArrayIntValueLookup(MMapBuffer buffer, int length) {
        this.buffer = buffer;
        this.intArray = buffer.memory().intArray(0, length);
    }

    @Override
    public long getMin() {
        return Integer.MIN_VALUE;
    }

    @Override
    public long getMax() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void lookup(int[] docIds, long[] values, int n) {
        for (int i = 0; i < n; ++i) {
            values[i] = intArray.get(docIds[i]);
        }
    }

    @Override
    public long memoryUsed() {
        return 0;
    }

    @Override
    public void close() {
        Closeables2.closeQuietly(buffer, LOG);
    }
}
