package org.jrebirth.af.core.concurrent;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import org.jrebirth.af.core.application.Configuration;
import org.jrebirth.af.core.application.DefaultApplication;
import org.jrebirth.af.core.ui.Model;

/**
 * The class <strong>ThreadApplication</strong>.
 * 
 * @author Sébastien Bordes
 */
@Configuration(value = ".*-jrebirth", extension = "properties", schedule = 60)
public class ThreadPoolApplication extends DefaultApplication<Pane> {

    private static ThreadPoolApplication instance;

    public static ThreadPoolApplication getInstance() {
        return instance;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<? extends Model> getFirstModelClass() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void customizeStage(final Stage stage) {
        instance = this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getApplicationTitle() {
        return "Thread Application";
    }

}
