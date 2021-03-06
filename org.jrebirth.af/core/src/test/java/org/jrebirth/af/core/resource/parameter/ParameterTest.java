package org.jrebirth.af.core.resource.parameter;

import org.jrebirth.af.core.resource.ResourceBuilders;
import org.jrebirth.af.core.resource.parameter.ParameterItem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The class <strong>ParameterTest</strong>.
 * 
 * @author Sébastien Bordes
 */
public class ParameterTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ResourceBuilders.PARAMETER_BUILDER.searchConfigurationFiles(".*jrebirth", "properties");
    }

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void stringParameter() {

        checkStringParameter(TestParameters.TEST_STRING_PARAM_1, "fonts");
        checkStringParameter(TestParameters.TEST_STRING_PARAM_2, "fontsFolder");
        checkStringParameter(TestParameters.TEST_STRING_PARAM_3, "font");// Default value
        checkStringParameter(TestParameters.TEST_STRING_PARAM_4, "fonts");// properties value, default one is ignored
    }

    private void checkStringParameter(final ParameterItem<String> parameterItem, final String checkedName) {
        final String param = parameterItem.get();
        assertEquals("Check String", checkedName, param);

    }

    @Test
    public void integerParameter() {

        checkIntegerParameter(TestParameters.TEST_INTEGER_WIDTH, 800);
    }

    private void checkIntegerParameter(final ParameterItem<Integer> parameterItem, final Integer checkedValue) {
        final Integer param = parameterItem.get();
        assertEquals("Check Integer", checkedValue, param);

    }

    @Test
    public void overridableParameter() {

        TestParameters.OVERRIDABLE_PARAM.define(2000);

        assertEquals(2000, TestParameters.OVERRIDABLE_PARAM.get().intValue());

        try {
            System.gc();
            Thread.sleep(500);
            System.gc();
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals(2000, TestParameters.OVERRIDABLE_PARAM.get().intValue());

    }

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

}
