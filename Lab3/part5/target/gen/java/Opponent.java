/**
 * GENERATED CODE - DO NOT CHANGE
 */

import astra.core.*;
import astra.execution.*;
import astra.event.*;
import astra.messaging.*;
import astra.formula.*;
import astra.lang.*;
import astra.statement.*;
import astra.term.*;
import astra.type.*;
import astra.tr.*;
import astra.reasoner.util.*;


public class Opponent extends ASTRAClass {
	public Opponent() {
		setParents(new Class[] {Player.class});
		addRule(new Rule(
			"Opponent", new int[] {3,9,3,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(3)
			}),
			new Block(
				"Opponent", new int[] {3,32,3,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Opponent", new int[] {3,34,3,39},
						Primitive.newPrimitive(3)
					)
				}
			)
		));
		addRule(new Rule(
			"Opponent", new int[] {4,9,4,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(5)
			}),
			new Block(
				"Opponent", new int[] {4,32,4,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Opponent", new int[] {4,34,4,39},
						Primitive.newPrimitive(5)
					)
				}
			)
		));
		addRule(new Rule(
			"Opponent", new int[] {5,9,5,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(7)
			}),
			new Block(
				"Opponent", new int[] {5,32,5,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Opponent", new int[] {5,34,5,39},
						Primitive.newPrimitive(7)
					)
				}
			)
		));
		addRule(new Rule(
			"Opponent", new int[] {6,9,6,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(1)
			}),
			new Block(
				"Opponent", new int[] {6,32,6,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Opponent", new int[] {6,34,6,39},
						Primitive.newPrimitive(1)
					)
				}
			)
		));
		addRule(new Rule(
			"Opponent", new int[] {7,9,7,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(2)
			}),
			new Block(
				"Opponent", new int[] {7,32,7,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Opponent", new int[] {7,34,7,39},
						Primitive.newPrimitive(2)
					)
				}
			)
		));
		addRule(new Rule(
			"Opponent", new int[] {8,9,8,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(4)
			}),
			new Block(
				"Opponent", new int[] {8,32,8,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Opponent", new int[] {8,34,8,39},
						Primitive.newPrimitive(4)
					)
				}
			)
		));
		addRule(new Rule(
			"Opponent", new int[] {9,9,9,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(6)
			}),
			new Block(
				"Opponent", new int[] {9,32,9,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Opponent", new int[] {9,34,9,39},
						Primitive.newPrimitive(6)
					)
				}
			)
		));
		addRule(new Rule(
			"Opponent", new int[] {10,9,10,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(8)
			}),
			new Block(
				"Opponent", new int[] {10,32,10,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Opponent", new int[] {10,34,10,39},
						Primitive.newPrimitive(8)
					)
				}
			)
		));
		addRule(new Rule(
			"Opponent", new int[] {11,9,11,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(9)
			}),
			new Block(
				"Opponent", new int[] {11,32,11,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Opponent", new int[] {11,34,11,39},
						Primitive.newPrimitive(9)
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		return fragment;
	}

	public static void main(String[] args) {
		Scheduler.setStrategy(new TestSchedulerStrategy());
		ListTerm argList = new ListTerm();
		for (String arg: args) {
			argList.add(Primitive.newPrimitive(arg));
		}

		String name = java.lang.System.getProperty("astra.name", "main");
		try {
			astra.core.Agent agent = new Opponent().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
