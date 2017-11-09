package com.example.temperatureconverter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

/**
 * Created by cmk on 2017/11/8.
 */

@RunWith(MockitoJUnitRunner.class)
public class DisplayTest {
    @Test
    public void shouldContainTheCorrectExtrasFToC()  throws Exception {
        Context context = mock(Context.class);
        Intent intent = MainActivity.createIntent(context, "100", "212", 1);
        assertNotNull(intent);
        Bundle extras = intent.getExtras();
        assertNotNull(extras);
        assertEquals("212F is 100C", extras.getString("result"));
    }

    @Test
    public void shouldContainTheCorrectExtrasCToF()  throws Exception {
        Context context = mock(Context.class);
        Intent intent = MainActivity.createIntent(context, "100", "212", 0);
        assertNotNull(intent);
        Bundle extras = intent.getExtras();
        assertNotNull(extras);
        assertEquals("100C is 212F", extras.getString("result"));
    }
}
