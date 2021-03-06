/*
#    This program is free software: you can redistribute it and/or modify
#    it under the terms of the GNU General Public License as published by
#    the Free Software Foundation, either version 3 of the License, or
#    (at your option) any later version.
#
#    This program is distributed in the hope that it will be useful,
#    but WITHOUT ANY WARRANTY; without even the implied warranty of
#    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#    GNU General Public License for more details.
#
#    You should have received a copy of the GNU General Public License
#    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pl.art.lach.mateusz.openchess.core.pieces;

import pl.art.lach.mateusz.openchess.core.Color;

/**
 * @author: Mateusz Sławomir Lach 
 */
class Queen extends Piece {

    private static final char QUEEN_SYMBOL = 'Q';

    Queen(final Color color) {
        super(9, QUEEN_SYMBOL, color);
        getStrategies().add(getStrategyFactory().getRookStrategy());
        getStrategies().add(getStrategyFactory().getBishopStrategy());
    }
}
