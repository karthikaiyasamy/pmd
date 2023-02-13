/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.objectivec.cpd;

import net.sourceforge.pmd.cpd.impl.JavaCCTokenizer;
import net.sourceforge.pmd.lang.TokenManager;
import net.sourceforge.pmd.lang.ast.impl.javacc.CharStream;
import net.sourceforge.pmd.lang.ast.impl.javacc.JavaccToken;
import net.sourceforge.pmd.lang.document.TextDocument;
import net.sourceforge.pmd.lang.objectivec.ast.ObjectiveCTokenKinds;

/**
 * The Objective-C Tokenizer
 */
public class ObjectiveCTokenizer extends JavaCCTokenizer {

    @Override
    protected TokenManager<JavaccToken> makeLexerImpl(TextDocument doc) {
        return ObjectiveCTokenKinds.newTokenManager(CharStream.create(doc));
    }
}
