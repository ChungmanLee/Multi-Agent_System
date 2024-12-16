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
		addRule(new Rule(
			"Player", new int[] {39,9,39,59},
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
					new Variable(Type.STRING, "O",false)
				})
			),
			new Block(
				"Player", new int[] {39,58,53,5},
				new Statement[] {
					new If(
						"Player", new int[] {40,8,53,5},
						new Predicate("winner", new Term[] {
							new Variable(Type.STRING, "W",false)
						}),
						new Block(
							"Player", new int[] {40,28,43,9},
							new Statement[] {
								new BeliefUpdate('-',
									"Player", new int[] {41,12,43,9},
									new Predicate("turn", new Term[] {
										new Variable(Type.STRING, "T")
									})
								),
								new ModuleCall("C",
									"Player", new int[] {42,12,42,37},
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
						),
						new If(
							"Player", new int[] {43,14,53,5},
							new Predicate("drawn", new Term[] {}),
							new Block(
								"Player", new int[] {43,25,46,9},
								new Statement[] {
									new BeliefUpdate('-',
										"Player", new int[] {44,12,46,9},
										new Predicate("turn", new Term[] {
											new Variable(Type.STRING, "T")
										})
									),
									new ModuleCall("C",
										"Player", new int[] {45,12,45,31},
										new Predicate("println", new Term[] {
											Primitive.newPrimitive("Drown!")
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
							),
							new Block(
								"Player", new int[] {46,13,53,5},
								new Statement[] {
									new Subgoal(
										"Player", new int[] {47,12,52,9},
										new Goal(
											new Predicate("move", new Term[] {
												new Variable(Type.INTEGER, "L",false)
											})
										)
									),
									new Subgoal(
										"Player", new int[] {48,12,52,9},
										new Goal(
											new Predicate("played", new Term[] {
												new Variable(Type.STRING, "T"),
												new Variable(Type.INTEGER, "L")
											})
										)
									),
									new ModuleCall("C",
										"Player", new int[] {49,12,49,44},
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
									new BeliefUpdate('-',
										"Player", new int[] {50,12,52,9},
										new Predicate("turn", new Term[] {
											new Variable(Type.STRING, "T")
										})
									),
									new Send("Player", new int[] {51,12,51,40},
										new Performative("inform"),
										new Variable(Type.STRING, "O"),
										new Predicate("played", new Term[] {
											new Variable(Type.STRING, "T"),
											new Variable(Type.INTEGER, "L")
										})
									)
								}
							)
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {55,9,55,46},
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
				"Player", new int[] {55,45,57,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {56,8,57,5},
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "T"),
							new Variable(Type.INTEGER, "L")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {59,9,59,63},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new ListTerm(new Term[] {
							new Variable(Type.STRING, "token",false),
							new Variable(Type.STRING, "opponent",false),
							new Variable(Type.BOOLEAN, "turn",false)
						})
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {59,62,69,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {60,8,69,5},
						new Predicate("token", new Term[] {
							new Variable(Type.STRING, "token")
						})
					),
					new BeliefUpdate('+',
						"Player", new int[] {61,8,69,5},
						new Predicate("opponent", new Term[] {
							new Variable(Type.STRING, "opponent")
						})
					),
					new If(
						"Player", new int[] {62,8,69,5},
						new Comparison("==",
							new Variable(Type.BOOLEAN, "turn"),
							Primitive.newPrimitive(true)
						),
						new Block(
							"Player", new int[] {62,25,65,9},
							new Statement[] {
								new BeliefUpdate('+',
									"Player", new int[] {63,12,65,9},
									new Predicate("first", new Term[] {
										Primitive.newPrimitive(true)
									})
								),
								new BeliefUpdate('+',
									"Player", new int[] {64,12,65,9},
									new Predicate("turn", new Term[] {
										new Variable(Type.STRING, "token")
									})
								)
							}
						),
						new Block(
							"Player", new int[] {65,13,69,5},
							new Statement[] {
								new BeliefUpdate('+',
									"Player", new int[] {66,12,68,9},
									new Predicate("first", new Term[] {
										Primitive.newPrimitive(false)
									})
								),
								new ModuleCall("C",
									"Player", new int[] {67,12,67,53},
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
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {71,9,71,88},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("played", new Term[] {
					new Variable(Type.STRING, "T",false),
					new Variable(Type.INTEGER, "L",false)
				})
			),
			new Predicate("token", new Term[] {
				new Variable(Type.STRING, "token",false)
			}),
			new Block(
				"Player", new int[] {71,87,74,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {72,8,74,5},
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "T"),
							new Variable(Type.INTEGER, "L")
						})
					),
					new BeliefUpdate('+',
						"Player", new int[] {73,8,74,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "token")
						})
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
				Primitive.newPrimitive(5),
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
				Primitive.newPrimitive("O")
			})
		);
		agent.initialize(
			new Predicate("player", new Term[] {
				Primitive.newPrimitive("X")
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
