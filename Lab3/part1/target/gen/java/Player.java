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


public class Player extends ASTRAClass {
	public Player() {
		setParents(new Class[] {astra.lang.Agent.class});
		addInference(new Inference(
			new Predicate("free", new Term[] {
				new Variable(Type.INTEGER, "L",false)
			}),
			new AND(
				new Predicate("location", new Term[] {
					new Variable(Type.INTEGER, "L")
				}),
				new NOT(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "T",false),
						new Variable(Type.INTEGER, "L")
					})
				)
			)
		));
		addInference(new Inference(
			new Predicate("winner", new Term[] {
				new Variable(Type.STRING, "T",false)
			}),
			new AND(
				new Predicate("line", new Term[] {
					new Variable(Type.INTEGER, "L1",false),
					new Variable(Type.INTEGER, "L2",false),
					new Variable(Type.INTEGER, "L3",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "T"),
						new Variable(Type.INTEGER, "L1")
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "T"),
							new Variable(Type.INTEGER, "L2")
						}),
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "T"),
							new Variable(Type.INTEGER, "L3")
						})
					)
				)
			)
		));
		addInference(new Inference(
			new Predicate("loser", new Term[] {
				new Variable(Type.STRING, "T",false)
			}),
			new AND(
				new Predicate("player", new Term[] {
					new Variable(Type.STRING, "T")
				}),
				new AND(
					new Predicate("winner", new Term[] {
						new Variable(Type.STRING, "T2",false)
					}),
					new Comparison("~=",
						new Variable(Type.STRING, "T"),
						new Variable(Type.STRING, "T2")
					)
				)
			)
		));
		addInference(new Inference(
			new Predicate("drawn", new Term[] {}),
			new AND(
				new NOT(
					new Predicate("free", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				),
				new NOT(
					new Predicate("winner", new Term[] {
						new Variable(Type.STRING, "T2",false)
					})
				)
			)
		));
		addInference(new Inference(
			new Predicate("opponent", new Term[] {
				new Variable(Type.STRING, "T",false),
				new Variable(Type.STRING, "O",false)
			}),
			new AND(
				new Predicate("player", new Term[] {
					new Variable(Type.STRING, "O")
				}),
				new Comparison("~=",
					new Variable(Type.STRING, "O"),
					new Variable(Type.STRING, "T")
				)
			)
		));
		addRule(new Rule(
			"Player", new int[] {38,9,38,63},
			new BeliefEvent('+',
				new Predicate("turn", new Term[] {
					new Variable(Type.STRING, "T",false)
				})
			),
			new AND(
				new Predicate("player", new Term[] {
					new Variable(Type.STRING, "T")
				}),
				new Predicate("opponent", new Term[] {
					new Variable(Type.STRING, "T"),
					new Variable(Type.STRING, "T2",false)
				})
			),
			new Block(
				"Player", new int[] {38,62,43,5},
				new Statement[] {
					new Subgoal(
						"Player", new int[] {39,8,43,5},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.INTEGER, "L",false)
							})
						)
					),
					new Subgoal(
						"Player", new int[] {40,8,43,5},
						new Goal(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "T"),
								new Variable(Type.INTEGER, "L")
							})
						)
					),
					new ModuleCall("C",
						"Player", new int[] {41,8,41,40},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								new Variable(Type.STRING, "T"),
								Operator.newOperator('+',
									Primitive.newPrimitive(" marked on "),
									new Variable(Type.INTEGER, "L")
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"Player", new int[] {42,8,43,5},
						new Goal(
							new Predicate("turn", new Term[] {
								new Variable(Type.STRING, "T2")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {45,9,45,46},
			new GoalEvent('+',
				new Goal(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "T",false),
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				new Variable(Type.INTEGER, "L")
			}),
			new Block(
				"Player", new int[] {45,45,47,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {46,8,47,5},
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "T"),
							new Variable(Type.INTEGER, "L")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {49,9,49,64},
			new GoalEvent('+',
				new Goal(
					new Predicate("turn", new Term[] {
						new Variable(Type.STRING, "T2",false)
					})
				)
			),
			new AND(
				new Predicate("turn", new Term[] {
					new Variable(Type.STRING, "T",false)
				}),
				new Predicate("winner", new Term[] {
					new Variable(Type.STRING, "W",false)
				})
			),
			new Block(
				"Player", new int[] {49,63,52,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Player", new int[] {50,8,52,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "T")
						})
					),
					new ModuleCall("C",
						"Player", new int[] {51,8,51,33},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Winner: "),
								new Variable(Type.STRING, "W")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {54,9,54,55},
			new GoalEvent('+',
				new Goal(
					new Predicate("turn", new Term[] {
						new Variable(Type.STRING, "T2",false)
					})
				)
			),
			new AND(
				new Predicate("turn", new Term[] {
					new Variable(Type.STRING, "T",false)
				}),
				new Predicate("drawn", new Term[] {})
			),
			new Block(
				"Player", new int[] {54,54,57,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Player", new int[] {55,8,57,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "T")
						})
					),
					new ModuleCall("C",
						"Player", new int[] {56,8,56,27},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Drawn!")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {59,9,59,45},
			new GoalEvent('+',
				new Goal(
					new Predicate("turn", new Term[] {
						new Variable(Type.STRING, "T2",false)
					})
				)
			),
			new Predicate("turn", new Term[] {
				new Variable(Type.STRING, "T",false)
			}),
			new Block(
				"Player", new int[] {59,44,61,5},
				new Statement[] {
					new SpecialBeliefUpdate(
						"Player", new int[] {60,8,61,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "T2")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {64,9,64,33},
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
				"Player", new int[] {64,32,64,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {64,34,64,39},
						Primitive.newPrimitive(1)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {65,9,65,33},
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
				"Player", new int[] {65,32,65,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {65,34,65,39},
						Primitive.newPrimitive(2)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {66,9,66,33},
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
				"Player", new int[] {66,32,66,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {66,34,66,39},
						Primitive.newPrimitive(3)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {67,9,67,33},
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
				"Player", new int[] {67,32,67,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {67,34,67,39},
						Primitive.newPrimitive(4)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {68,9,68,33},
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
				"Player", new int[] {68,32,68,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {68,34,68,39},
						Primitive.newPrimitive(5)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {69,9,69,33},
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
				"Player", new int[] {69,32,69,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {69,34,69,39},
						Primitive.newPrimitive(6)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {70,9,70,33},
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
				"Player", new int[] {70,32,70,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {70,34,70,39},
						Primitive.newPrimitive(7)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {71,9,71,33},
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
				"Player", new int[] {71,32,71,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {71,34,71,39},
						Primitive.newPrimitive(8)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {72,9,72,33},
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
				"Player", new int[] {72,32,72,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {72,34,72,39},
						Primitive.newPrimitive(9)
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.initialize(
			new Predicate("location", new Term[] {
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("location", new Term[] {
				Primitive.newPrimitive(2)
			})
		);
		agent.initialize(
			new Predicate("location", new Term[] {
				Primitive.newPrimitive(3)
			})
		);
		agent.initialize(
			new Predicate("location", new Term[] {
				Primitive.newPrimitive(4)
			})
		);
		agent.initialize(
			new Predicate("location", new Term[] {
				Primitive.newPrimitive(5)
			})
		);
		agent.initialize(
			new Predicate("location", new Term[] {
				Primitive.newPrimitive(6)
			})
		);
		agent.initialize(
			new Predicate("location", new Term[] {
				Primitive.newPrimitive(7)
			})
		);
		agent.initialize(
			new Predicate("location", new Term[] {
				Primitive.newPrimitive(8)
			})
		);
		agent.initialize(
			new Predicate("location", new Term[] {
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(2),
				Primitive.newPrimitive(3)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(4),
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(6)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(7),
				Primitive.newPrimitive(8),
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(4),
				Primitive.newPrimitive(7)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(2),
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(8)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(3),
				Primitive.newPrimitive(6),
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(3),
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(3),
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(7)
			})
		);
		agent.initialize(
			new Predicate("player", new Term[] {
				Primitive.newPrimitive("X")
			})
		);
		agent.initialize(
			new Predicate("player", new Term[] {
				Primitive.newPrimitive("O")
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("S",astra.lang.System.class,agent);
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
			astra.core.Agent agent = new Player().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
