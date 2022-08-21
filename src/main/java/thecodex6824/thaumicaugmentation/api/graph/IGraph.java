/**
 *  Thaumic Augmentation
 *  Copyright (c) 2019 TheCodex6824.
 *
 *  This file is part of Thaumic Augmentation.
 *
 *  Thaumic Augmentation is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Thaumic Augmentation is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with Thaumic Augmentation.  If not, see <https://www.gnu.org/licenses/>.
 */

package thecodex6824.thaumicaugmentation.api.graph;

import java.util.Deque;
import java.util.Set;

import javax.annotation.Nullable;

public interface IGraph<Node> {

    public boolean addNode(Node node);
    
    public boolean removeNode(Node node);
    
    public int size();
    
    public default boolean isEmpty() {
        return size() == 0;
    }
    
    public Set<Node> getNodes();
    
    public Set<Node> getInputs(Node node);
    
    public Set<Node> getOutputs(Node node);
    
    public boolean addInput(Node node, Node newInput);
    
    public boolean addOutput(Node node, Node newOutput);
    
    public boolean removeInput(Node node, Node input);
    
    public boolean removeOutput(Node node, Node output);
    
    public @Nullable Deque<Node> findPath(Node start, Node end);
    
}
