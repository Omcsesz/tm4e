/**
 *  Copyright (c) 2015-2017 Angelo ZERR.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Initial code from https://github.com/Microsoft/vscode-textmate/
 * Initial copyright Copyright (C) Microsoft Corporation. All rights reserved.
 * Initial license: MIT
 *
 * Contributors:
 *  - Microsoft Corporation: Initial code, written in TypeScript, licensed under MIT license
 *  - Angelo Zerr <angelo.zerr@gmail.com> - translation and adaptation to Java
 */
package org.eclipse.tm4e.core.grammar;

/**
 * Result of the line tokenization API.
 *
 * @see https://github.com/Microsoft/vscode-textmate/blob/master/src/main.ts
 */
public interface ITokenizeLineResult {

	IToken[] getTokens();

	/**
	 * Returns the `prevState` to be passed on to the next line tokenization.
	 * 
	 * @return the `prevState` to be passed on to the next line tokenization.
	 */
	StackElement getRuleStack();

}
