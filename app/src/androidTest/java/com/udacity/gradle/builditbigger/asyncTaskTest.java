package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

public class AsyncTaskTest extends AndroidTestCase {
    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    public void testOnPostExecute() throws Exception {
        String result = "";

        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask(null);
        result = asyncTask.execute("").get();

        assertTrue(result != "");

    }
}
