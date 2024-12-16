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


public class Flasher extends ASTRAClass {
	public Flasher() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"Flasher", new int[] {20,9,20,28},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					new Variable(Type.STRING, "S",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Flasher", new int[] {20,27,22,5},
				new Statement[] {
					new Subgoal(
						"Flasher", new int[] {21,8,22,5},
						new Goal(
							new Predicate("light", new Term[] {
								Primitive.newPrimitive("l1"),
								new Variable(Type.STRING, "S")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Flasher", new int[] {25,9,25,78},
			new GoalEvent('+',
				new Goal(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "L",false),
						new Variable(Type.STRING, "S",false)
					})
				)
			),
			new AND(
				new Predicate("transition", new Term[] {
					new Variable(Type.STRING, "R",false),
					new Variable(Type.STRING, "S")
				}),
				new Predicate("light", new Term[] {
					new Variable(Type.STRING, "L"),
					new Variable(Type.STRING, "R")
				})
			),
			new Block(
				"Flasher", new int[] {25,77,29,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Flasher", new int[] {26,8,29,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "L"),
							new Variable(Type.STRING, "R")
						})
					),
					new BeliefUpdate('+',
						"Flasher", new int[] {27,8,29,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "L"),
							new Variable(Type.STRING, "S")
						})
					),
					new ModuleCall("console",
						"Flasher", new int[] {28,8,28,60},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Light: "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "L"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" is in state:"),
										new Variable(Type.STRING, "S")
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Flasher","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Flasher", new int[] {32,9,32,38},
			new GoalEvent('+',
				new Goal(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "L",false),
						new Variable(Type.STRING, "S",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Flasher", new int[] {32,37,34,5},
				new Statement[] {
					new ModuleCall("console",
						"Flasher", new int[] {33,8,33,60},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Light: "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "L"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" is in state: "),
										new Variable(Type.STRING, "S")
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Flasher","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Flasher", new int[] {48,9,48,19},
			new GoalEvent('+',
				new Goal(
					new Predicate("flip", new Term[] {
						Primitive.newPrimitive(0)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Flasher", new int[] {48,18,48,20},
				new Statement[] {
				}
			)
		));
		addRule(new Rule(
			"Flasher", new int[] {49,9,49,69},
			new GoalEvent('+',
				new Goal(
					new Predicate("flip", new Term[] {
						new Variable(Type.INTEGER, "X",false)
					})
				)
			),
			new AND(
				new Predicate("switch", new Term[] {
					new Variable(Type.STRING, "S",false)
				}),
				new Predicate("transition", new Term[] {
					new Variable(Type.STRING, "S"),
					new Variable(Type.STRING, "T",false)
				})
			),
			new Block(
				"Flasher", new int[] {49,68,54,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Flasher", new int[] {50,8,54,5},
						new Predicate("switch", new Term[] {
							new Variable(Type.STRING, "S")
						})
					),
					new BeliefUpdate('+',
						"Flasher", new int[] {51,8,54,5},
						new Predicate("switch", new Term[] {
							new Variable(Type.STRING, "T")
						})
					),
					new ModuleCall("system",
						"Flasher", new int[] {52,8,52,24},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(200)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Flasher","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"Flasher", new int[] {53,8,54,5},
						new Goal(
							new Predicate("flip", new Term[] {
								Operator.newOperator('-',
									new Variable(Type.INTEGER, "X"),
									Primitive.newPrimitive(1)
								)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Flasher", new int[] {57,9,57,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Flasher", new int[] {57,27,61,5},
				new Statement[] {
					new ModuleCall("system",
						"Flasher", new int[] {58,8,58,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(2000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Flasher","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("console",
						"Flasher", new int[] {59,8,59,55},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Starting on and off 10 times")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Flasher","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"Flasher", new int[] {60,8,61,5},
						new Goal(
							new Predicate("flip", new Term[] {
								Primitive.newPrimitive(10)
							})
						)
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.initialize(
			new Predicate("switch", new Term[] {
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("light", new Term[] {
				Primitive.newPrimitive("l1"),
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("transition", new Term[] {
				Primitive.newPrimitive("off"),
				Primitive.newPrimitive("on")
			})
		);
		agent.initialize(
			new Predicate("transition", new Term[] {
				Primitive.newPrimitive("on"),
				Primitive.newPrimitive("off")
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("console",astra.lang.Console.class,agent);
		fragment.addModule("system",astra.lang.System.class,agent);
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
			astra.core.Agent agent = new Flasher().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
