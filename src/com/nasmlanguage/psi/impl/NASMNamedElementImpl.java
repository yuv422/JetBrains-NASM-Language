/*++

NASM Assembly Language Plugin
Copyright (c) 2017-2018 Aidan Khoury. All rights reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.

--*/

package com.nasmlanguage.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.nasmlanguage.psi.NASMNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class NASMNamedElementImpl extends ASTWrapperPsiElement implements NASMNamedElement {
    public NASMNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
