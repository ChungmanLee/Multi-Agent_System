# Multi-Agent System Labs

## Overview
This repository contains a series of lab implementations focused on multi-agent systems, designed using the **Astra Agent Programming Language**. Each lab demonstrates unique use cases, ranging from block manipulation, light control, and tic-tac-toe strategies to leader-follower robot coordination in a simulated vacuum world.

---
## Getting Started

### Prerequisites
1. Install **Astra Agent Programming Environment**.
2. Java Development Kit (JDK) 11 or higher.
3. Required libraries for the Java modules.
4. install Astra extention in VS code(https://guide.astralanguage.com/en/latest/getting-started/) or Intellij(https://guide.astralanguage.com/en/latest/ides/intellij/)

### Running the Labs
1. **Open the specific folder starting with "part"**
2. **Build maven project**
3. **Use command "astra:deploy" (https://guide.astralanguage.com/en/latest/ides/intellij/#running-the-project)**
---

## Lab 1: Block Manipulation (`Main` Agent)
This lab involves creating towers using blocks, demonstrating the ability of agents to manipulate objects within an environment.

### Key Features
- **Block Inference Rules**: Agents infer which blocks are free and detect towers within the environment.
- **Random Tower Generation**: Blocks are shuffled and used to construct towers randomly.
- **Agent Behavior**: Implements detailed logic for stacking blocks, moving blocks, and ensuring stability.

---

## Lab 2: Light Control (`LightBaby` Agent)
This lab simulates the control of a light bulb based on ambient light levels and predefined thresholds.

### Key Features
- **Light Threshold Logic**: The light turns on or off based on lux values compared to a threshold.
- **Day Simulation**: Simulates changes in light levels across a 24-hour day.
- **Switch Simulation**: Automatically toggles the light switch at predefined hours.
- **State Monitoring**: Keeps track of light states and reacts to environmental changes.

---

## Lab 3: Tic-Tac-Toe Strategy
This lab implements a competitive **Tic-Tac-Toe** game between different player agents (`Better`, `LinearPlayer`, and `Opponent`).

### Key Features
- **Player Strategies**:
  - **Better**: Implements advanced strategies to block opponents and prioritize winning moves.
  - **LinearPlayer**: Sequentially selects the first available cell.
  - **Opponent**: Follows a predefined movement strategy.
- **Inference Rules**:
  - `danger`: Identifies when the opponent is about to win.
  - `almost`: Identifies when the agent is close to winning.
- **Main Agent**: Configures game settings and initializes matches between agents.

---

## Lab 4: Leader-Follower Vacuum World
This lab simulates a vacuum world where a **Leader** agent coordinates tasks for multiple **Follower** agents to clean a grid.

### Key Features
- **Leader Agent**:
  - Maintains a dust location list and assigns tasks to followers.
  - Updates map boundaries dynamically based on the agent's exploration.
  - Communicates with followers to share the map and assign tasks.
- **Follower Agent**:
  - Receives target locations and plans routes using a gradient-based pathfinding algorithm.
  - Avoids obstacles and replans routes as necessary.
- **Gradient Map**:
  - Implements pathfinding and obstacle recording.
  - Generates and visualizes gradient maps for route planning.

---

## Key Files and Modules

### Agents
- **`Main`**: Coordinates and initializes each lab's environment and agents.
- **`Better`, `LinearPlayer`, `Opponent`**: Player agents for the Tic-Tac-Toe game.
- **`Leader`, `Follower`**: Agents for the vacuum world lab.

### Java Integration
- **`GradientMap`**: Implements gradient-based pathfinding and obstacle management.
- **`Routing`**: Integrates with the Astra agent environment for route planning and obstacle recording.