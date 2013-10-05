/*
 * Copyright 2004 - 2013 Wayne Grant
 *           2013 Kai Kramer
 *
 * This file is part of KeyStore Explorer.
 *
 * KeyStore Explorer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * KeyStore Explorer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with KeyStore Explorer.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.keystore_explorer.gui.ticker;

import javax.swing.JComponent;

/**
 * Interface for renderers to use with the JTicker Swing control.
 * 
 */
public interface TickerRenderer {
	/**
	 * Get the rendering component for the specified JTicker and ticker item
	 * 
	 * @return Rendering component
	 * @param ticker
	 *            The JTicker that is asking the renderer to draw
	 * @param value
	 *            The value of the ticker item to be rendered
	 */
	JComponent getTickerRendererComponent(JTicker ticker, Object value);
}
