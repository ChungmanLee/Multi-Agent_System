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
			"Player", new int[] {41,9,41,63},
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
				"Player", new int[] {41,62,46,5},
				new Statement[] {
					new Subgoal(
						"Player", new int[] {42,8,46,5},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.INTEGER, "L",false)
							})
						)
					),
					new Subgoal(
						"Player", new int[] {43,8,46,5},
						new Goal(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "T"),
								new Variable(Type.INTEGER, "L")
							})
						)
					),
					new ModuleCall("C",
						"Player", new int[] {44,8,44,40},
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
						"Player", new int[] {45,8,46,5},
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
			"Player", new int[] {48,9,48,46},
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
				"Player", new int[] {48,45,50,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {49,8,50,5},
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "T"),
							new Variable(Type.INTEGER, "L")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {52,9,52,64},
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
				"Player", new int[] {52,63,55,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Player", new int[] {53,8,55,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "T")
						})
					),
					new ModuleCall("C",
						"Player", new int[] {54,8,54,33},
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
			"Player", new int[] {57,9,57,55},
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
				"Player", new int[] {57,54,60,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Player", new int[] {58,8,60,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "T")
						})
					),
					new ModuleCall("C",
						"Player", new int[] {59,8,59,27},
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
			"Player", new int[] {62,9,62,45},
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
				"Player", new int[] {62,44,64,5},
				new Statement[] {
					new SpecialBeliefUpdate(
						"Player", new int[] {63,8,64,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "T2")
						})
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
				Primitive.newPrimitive(1)
			}),
			new Block(
				"Player", new int[] {67,32,67,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {67,34,67,39},
						Primitive.newPrimitive(1)
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
				Primitive.newPrimitive(2)
			}),
			new Block(
				"Player", new int[] {68,32,68,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {68,34,68,39},
						Primitive.newPrimitive(2)
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
				Primitive.newPrimitive(3)
			}),
			new Block(
				"Player", new int[] {69,32,69,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {69,34,69,39},
						Primitive.newPrimitive(3)
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
				Primitive.newPrimitive(4)
			}),
			new Block(
				"Player", new int[] {70,32,70,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {70,34,70,39},
						Primitive.newPrimitive(4)
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
				Primitive.newPrimitive(5)
			}),
			new Block(
				"Player", new int[] {71,32,71,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {71,34,71,39},
						Primitive.newPrimitive(5)
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
				Primitive.newPrimitive(6)
			}),
			new Block(
				"Player", new int[] {72,32,72,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {72,34,72,39},
						Primitive.newPrimitive(6)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {73,9,73,33},
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
				"Player", new int[] {73,32,73,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {73,34,73,39},
						Primitive.newPrimitive(7)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {74,9,74,33},
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
				"Player", new int[] {74,32,74,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {74,34,74,39},
						Primitive.newPrimitive(8)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {75,9,75,33},
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
				"Player", new int[] {75,32,75,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {75,34,75,39},
						Primitive.newPrimitive(9)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {77,9,77,46},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new ListTerm(new Term[] {
							new Variable(Type.STRING, "token",false),
							new Variable(Type.BOOLEAN, "turn",false)
						})
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {77,45,97,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {78,8,97,5},
						new Predicate("player", new Term[] {
							new Variable(Type.STRING, "token")
						})
					),
					new If(
						"Player", new int[] {79,8,97,5},
						new Comparison("==",
							new Variable(Type.BOOLEAN, "turn"),
							Primitive.newPrimitive(true)
						),
						new Block(
							"Player", new int[] {79,25,82,9},
							new Statement[] {
								new BeliefUpdate('+',
									"Player", new int[] {80,12,82,9},
									new Predicate("first", new Term[] {
										Primitive.newPrimitive(true)
									})
								),
								new BeliefUpdate('+',
									"Player", new int[] {81,12,82,9},
									new Predicate("turn", new Term[] {
										new Variable(Type.STRING, "token")
									})
								)
							}
						),
						new Block(
							"Player", new int[] {82,13,97,5},
							new Statement[] {
								new BeliefUpdate('+',
									"Player", new int[] {83,12,85,9},
									new Predicate("first", new Term[] {
										Primitive.newPrimitive(false)
									})
								),
								new ModuleCall("C",
									"Player", new int[] {84,12,84,53},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											Primitive.newPrimitive("It's not "),
											Operator.newOperator('+',
												new Variable(Type.STRING, "token"),
												Primitive.newPrimitive("'s turn")
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
								)
							}
						)
					),
					new ModuleCall("S",
						"Player", new int[] {86,8,86,20},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Player","S")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new If(
						"Player", new int[] {87,8,97,5},
						new Predicate("winner", new Term[] {
							new Variable(Type.STRING, "X",false)
						}),
						new ModuleCall("C",
							"Player", new int[] {88,12,88,46},
							new Predicate("println", new Term[] {
								Operator.newOperator('+',
									Primitive.newPrimitive("Player "),
									Operator.newOperator('+',
										new Variable(Type.STRING, "X"),
										Primitive.newPrimitive(" won.")
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
						)
					),
					new If(
						"Player", new int[] {89,8,97,5},
						new Predicate("loser", new Term[] {
							new Variable(Type.STRING, "Y",false)
						}),
						new ModuleCall("C",
							"Player", new int[] {90,12,90,47},
							new Predicate("println", new Term[] {
								Operator.newOperator('+',
									Primitive.newPrimitive("Player "),
									Operator.newOperator('+',
										new Variable(Type.STRING, "Y"),
										Primitive.newPrimitive(" lose.")
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
						)
					),
					new If(
						"Player", new int[] {91,8,97,5},
						new Predicate("drawn", new Term[] {}),
						new ModuleCall("C",
							"Player", new int[] {92,12,92,31},
							new Predicate("println", new Term[] {
								Primitive.newPrimitive("Drown.")
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
					),
					new If(
						"Player", new int[] {93,8,97,5},
						new Predicate("free", new Term[] {
							new Variable(Type.INTEGER, "L",false)
						}),
						new ModuleCall("C",
							"Player", new int[] {94,12,94,50},
							new Predicate("println", new Term[] {
								Operator.newOperator('+',
									Primitive.newPrimitive("First free location: "),
									new Variable(Type.INTEGER, "L")
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
					),
					new If(
						"Player", new int[] {95,8,97,5},
						new NOT(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "T",false),
								new Variable(Type.INTEGER, "L",false)
							})
						),
						new ModuleCall("C",
							"Player", new int[] {96,12,96,45},
							new Predicate("println", new Term[] {
								Primitive.newPrimitive("Game has not Started")
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
