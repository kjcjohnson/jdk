//[TODO] insert copywrite notice and license terms

package com.sun.source.tree;

import javax.lang.model.type.TypeKind;

/**
 * A tree node for a condition type
 *
 * For example:
 * <pre>
 *   <em>condition</em>
 * </pre>
 *
 * @jls --- does not exist yes
 *
 * @author Shayne Wadle
 * @author Keith Jens Carl Johnson
 * @author Ethan Brown
 * since ---
 */
public interface ConditionTypeTree extends Tree {
   /**
    * Returns the kind of this tree
    * @return the kind of condition
    */
    TypeKind getConditionTypeKind();
}
