package org.northcoders.denizens;

import org.northcoders.environment.Plateau;
import org.northcoders.environment.Position;

public interface Occupyable {

    Position place(Plateau plateau, Position position);
}
