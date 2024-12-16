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


public class LightBaby extends ASTRAClass {
	public LightBaby() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"LightBaby", new int[] {32,9,32,98},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					Primitive.newPrimitive("on")
				})
			),
			new AND(
				new Predicate("light_level", new Term[] {
					new Variable(Type.INTEGER, "Lux",false)
				}),
				new AND(
					new Predicate("light_threshold", new Term[] {
						new Variable(Type.INTEGER, "Threshold",false)
					}),
					new Comparison("<",
						new Variable(Type.INTEGER, "Lux"),
						new Variable(Type.INTEGER, "Threshold")
					)
				)
			),
			new Block(
				"LightBaby", new int[] {32,97,34,5},
				new Statement[] {
					new Subgoal(
						"LightBaby", new int[] {33,8,34,5},
						new Goal(
							new Predicate("light", new Term[] {
								Primitive.newPrimitive("l1"),
								Primitive.newPrimitive("on")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"LightBaby", new int[] {36,9,36,99},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					Primitive.newPrimitive("on")
				})
			),
			new AND(
				new Predicate("light_level", new Term[] {
					new Variable(Type.INTEGER, "Lux",false)
				}),
				new AND(
					new Predicate("light_threshold", new Term[] {
						new Variable(Type.INTEGER, "Threshold",false)
					}),
					new Comparison(">=",
						new Variable(Type.INTEGER, "Lux"),
						new Variable(Type.INTEGER, "Threshold")
					)
				)
			),
			new Block(
				"LightBaby", new int[] {36,98,39,5},
				new Statement[] {
					new ModuleCall("console",
						"LightBaby", new int[] {37,8,37,67},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("The Light Level("),
								Operator.newOperator('+',
									new Variable(Type.INTEGER, "Lux"),
									Primitive.newPrimitive(") Is Over 750")
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("LightBaby","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"LightBaby", new int[] {38,8,39,5},
						new Goal(
							new Predicate("light", new Term[] {
								Primitive.newPrimitive("l1"),
								Primitive.newPrimitive("off")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"LightBaby", new int[] {41,9,41,25},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					Primitive.newPrimitive("off")
				})
			),
			Predicate.TRUE,
			new Block(
				"LightBaby", new int[] {41,24,43,5},
				new Statement[] {
					new Subgoal(
						"LightBaby", new int[] {42,8,43,5},
						new Goal(
							new Predicate("light", new Term[] {
								Primitive.newPrimitive("l1"),
								Primitive.newPrimitive("off")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"LightBaby", new int[] {58,9,58,78},
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
				"LightBaby", new int[] {58,77,61,5},
				new Statement[] {
					new SpecialBeliefUpdate(
						"LightBaby", new int[] {59,8,61,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "L"),
							new Variable(Type.STRING, "S")
						})
					),
					new ModuleCall("console",
						"LightBaby", new int[] {60,8,60,60},
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
								return ((astra.lang.Console) intention.getModule("LightBaby","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"LightBaby", new int[] {64,9,64,38},
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
				"LightBaby", new int[] {64,37,66,5},
				new Statement[] {
					new ModuleCall("console",
						"LightBaby", new int[] {65,8,65,60},
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
								return ((astra.lang.Console) intention.getModule("LightBaby","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"LightBaby", new int[] {78,9,78,30},
			new GoalEvent('+',
				new Goal(
					new Predicate("day_simulation", new Term[] {
						Primitive.newPrimitive(24)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"LightBaby", new int[] {78,29,80,5},
				new Statement[] {
					new Subgoal(
						"LightBaby", new int[] {79,8,80,5},
						new Goal(
							new Predicate("day_simulation", new Term[] {
								Primitive.newPrimitive(0)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"LightBaby", new int[] {82,9,82,65},
			new GoalEvent('+',
				new Goal(
					new Predicate("day_simulation", new Term[] {
						new Variable(Type.INTEGER, "hour",false)
					})
				)
			),
			new Predicate("hour_light", new Term[] {
				new Variable(Type.INTEGER, "hour"),
				new Variable(Type.INTEGER, "lux",false)
			}),
			new Block(
				"LightBaby", new int[] {82,64,87,5},
				new Statement[] {
					new SpecialBeliefUpdate(
						"LightBaby", new int[] {83,8,87,5},
						new Predicate("light_level", new Term[] {
							new Variable(Type.INTEGER, "lux")
						})
					),
					new ModuleCall("system",
						"LightBaby", new int[] {84,8,84,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("LightBaby","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"LightBaby", new int[] {85,8,87,5},
						new Goal(
							new Predicate("switch_simulation", new Term[] {
								new Variable(Type.INTEGER, "hour")
							})
						)
					),
					new Subgoal(
						"LightBaby", new int[] {86,8,87,5},
						new Goal(
							new Predicate("day_simulation", new Term[] {
								Operator.newOperator('+',
									new Variable(Type.INTEGER, "hour"),
									Primitive.newPrimitive(1)
								)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"LightBaby", new int[] {90,9,90,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("switch_simulation", new Term[] {
						Primitive.newPrimitive(10)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"LightBaby", new int[] {90,32,93,5},
				new Statement[] {
					new ModuleCall("console",
						"LightBaby", new int[] {91,8,91,70},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Current Time: "),
								Operator.newOperator('+',
									Primitive.newPrimitive(10),
									Primitive.newPrimitive(" Trying to Switch On")
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("LightBaby","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new SpecialBeliefUpdate(
						"LightBaby", new int[] {92,8,93,5},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("on")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"LightBaby", new int[] {95,9,95,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("switch_simulation", new Term[] {
						Primitive.newPrimitive(18)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"LightBaby", new int[] {95,32,98,5},
				new Statement[] {
					new ModuleCall("console",
						"LightBaby", new int[] {96,8,96,71},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Current Time: "),
								Operator.newOperator('+',
									Primitive.newPrimitive(18),
									Primitive.newPrimitive(" Trying to Switch Off")
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("LightBaby","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new SpecialBeliefUpdate(
						"LightBaby", new int[] {97,8,98,5},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("off")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"LightBaby", new int[] {101,9,101,186},
			new GoalEvent('+',
				new Goal(
					new Predicate("switch_simulation", new Term[] {
						new Variable(Type.INTEGER, "hour",false)
					})
				)
			),
			new AND(
				new Predicate("switch", new Term[] {
					new Variable(Type.STRING, "T",false)
				}),
				new AND(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "L",false),
						new Variable(Type.STRING, "S",false)
					}),
					new AND(
						new Predicate("light_level", new Term[] {
							new Variable(Type.INTEGER, "Lux",false)
						}),
						new AND(
							new Predicate("light_threshold", new Term[] {
								new Variable(Type.INTEGER, "Threshold",false)
							}),
							new AND(
								new Comparison("==",
									new Variable(Type.STRING, "T"),
									Primitive.newPrimitive("on")
								),
								new AND(
									new Comparison("<",
										new Variable(Type.INTEGER, "Lux"),
										new Variable(Type.INTEGER, "Threshold")
									),
									new Comparison("==",
										new Variable(Type.STRING, "S"),
										Primitive.newPrimitive("off")
									)
								)
							)
						)
					)
				)
			),
			new Block(
				"LightBaby", new int[] {101,185,104,5},
				new Statement[] {
					new ModuleCall("console",
						"LightBaby", new int[] {102,8,102,121},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Current Time: "),
								Operator.newOperator('+',
									new Variable(Type.INTEGER, "hour"),
									Operator.newOperator('+',
										Primitive.newPrimitive(", Switch Is Already On And Current Lux("),
										Operator.newOperator('+',
											new Variable(Type.INTEGER, "Lux"),
											Primitive.newPrimitive(") Is Less Than 750")
										)
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("LightBaby","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"LightBaby", new int[] {103,8,104,5},
						new Goal(
							new Predicate("light", new Term[] {
								new Variable(Type.STRING, "L"),
								Primitive.newPrimitive("on")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"LightBaby", new int[] {107,9,107,40},
			new GoalEvent('+',
				new Goal(
					new Predicate("switch_simulation", new Term[] {
						new Variable(Type.INTEGER, "hour",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"LightBaby", new int[] {107,39,109,5},
				new Statement[] {
					new ModuleCall("console",
						"LightBaby", new int[] {108,8,108,48},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Current Time: "),
								new Variable(Type.INTEGER, "hour")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("LightBaby","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"LightBaby", new int[] {112,9,112,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"LightBaby", new int[] {112,27,114,5},
				new Statement[] {
					new SpawnGoal(
						"LightBaby", new int[] {113,8,114,5},
						new Goal(
							new Predicate("day_simulation", new Term[] {
								Primitive.newPrimitive(0)
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
			new Predicate("light_threshold", new Term[] {
				Primitive.newPrimitive(750)
			})
		);
		agent.initialize(
			new Predicate("transition", new Term[] {
				Primitive.newPrimitive("on"),
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
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(0),
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(2),
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(3),
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(4),
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(6),
				Primitive.newPrimitive(100)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(7),
				Primitive.newPrimitive(250)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(8),
				Primitive.newPrimitive(400)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(9),
				Primitive.newPrimitive(800)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(10),
				Primitive.newPrimitive(1000)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(11),
				Primitive.newPrimitive(1000)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(12),
				Primitive.newPrimitive(1000)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(13),
				Primitive.newPrimitive(1000)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(14),
				Primitive.newPrimitive(1000)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(15),
				Primitive.newPrimitive(800)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(16),
				Primitive.newPrimitive(700)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(17),
				Primitive.newPrimitive(600)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(18),
				Primitive.newPrimitive(600)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(19),
				Primitive.newPrimitive(400)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(20),
				Primitive.newPrimitive(100)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(21),
				Primitive.newPrimitive(100)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(22),
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(23),
				Primitive.newPrimitive(1)
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
			astra.core.Agent agent = new LightBaby().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
