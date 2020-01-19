package org.sonar.samples.java.checks;

import org.junit.Rule;
import org.sonar.plugins.java.api.tree.Tree.Kind;

import java.util.Collections;
import java.util.List;

@Rule(key = "MyFirstCustomRule")
public class MyCustomCheck extends IssuableSubscriberVisitor{
    @Override
    public List<Kind> nodesToVisit() {
        return Collections.emptyList();
    }


}
