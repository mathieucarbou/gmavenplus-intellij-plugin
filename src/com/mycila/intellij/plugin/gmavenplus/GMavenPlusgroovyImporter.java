package com.mycila.intellij.plugin.gmavenplus;

import org.jetbrains.idea.maven.importing.GroovyImporter;

/**
 * @author Mathieu Carbou (mathieu.carbou@gmail.com)
 * @date 2014-04-13
 */
public class GMavenPlusgroovyImporter extends GroovyImporter {
    public GMavenPlusgroovyImporter() {
        super("org.codehaus.gmavenplus", "gmavenplus-plugin");
    }
}
