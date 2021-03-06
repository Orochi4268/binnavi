// Copyright 2011-2016 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.security.zynamics.binnavi.Gui.GraphWindows.Actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;


import com.google.common.base.Preconditions;
import com.google.security.zynamics.binnavi.yfileswrap.Gui.GraphWindows.Implementations.CGraphDialogs;
import com.google.security.zynamics.binnavi.yfileswrap.zygraph.ZyGraph;

/**
 * Action class used to show the dialog where the settings of a graph can be changed.
 */
public final class CActionGraphSettings extends AbstractAction {
  /**
   * Used for serialization.
   */
  private static final long serialVersionUID = -4589275132326558095L;

  /**
   * Parent window used for graphs.
   */
  private final JFrame m_parent;

  /**
   * Graph whose settings are modified in the dialog.
   */
  private final ZyGraph m_graph;

  /**
   * Creates a new action object.
   *
   * @param parent Parent window used for graphs.
   * @param graph Graph whose settings are modified in the dialog.
   */
  public CActionGraphSettings(final JFrame parent, final ZyGraph graph) {
    super("Graph Settings");

    m_parent = Preconditions.checkNotNull(parent, "IE01258: Parent argument can not be null");
    m_graph = Preconditions.checkNotNull(graph, "IE01259: Graph argument can not be null");
  }

  @Override
  public void actionPerformed(final ActionEvent Event) {
    CGraphDialogs.showGraphSettingsDialog(m_parent, m_graph);
  }
}
