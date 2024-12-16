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


public class Better extends ASTRAClass {
	public Better() {
		setParents(new Class[] {Player.class});
		addInference(new Inference(
			new Predicate("danger", new Term[] {
				new Variable(Type.INTEGER, "N3",false)
			}),
			new AND(
				new Predicate("token", new Term[] {
					new Variable(Type.STRING, "T",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "O",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "T"),
							new Variable(Type.STRING, "O")
						),
						new AND(
							new Predicate("line", new Term[] {
								new Variable(Type.INTEGER, "N1",false),
								new Variable(Type.INTEGER, "N2",false),
								new Variable(Type.INTEGER, "N3")
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "O"),
									new Variable(Type.INTEGER, "N1")
								}),
								new AND(
									new Predicate("played", new Term[] {
										new Variable(Type.STRING, "O"),
										new Variable(Type.INTEGER, "N2")
									}),
									new Predicate("free", new Term[] {
										new Variable(Type.INTEGER, "N3")
									})
								)
							)
						)
					)
				)
			)
		));
		addInference(new Inference(
			new Predicate("danger", new Term[] {
				new Variable(Type.INTEGER, "N2",false)
			}),
			new AND(
				new Predicate("token", new Term[] {
					new Variable(Type.STRING, "T",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "O",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "T"),
							new Variable(Type.STRING, "O")
						),
						new AND(
							new Predicate("line", new Term[] {
								new Variable(Type.INTEGER, "N1",false),
								new Variable(Type.INTEGER, "N2"),
								new Variable(Type.INTEGER, "N3",false)
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "O"),
									new Variable(Type.INTEGER, "N1")
								}),
								new AND(
									new Predicate("played", new Term[] {
										new Variable(Type.STRING, "O"),
										new Variable(Type.INTEGER, "N3")
									}),
									new Predicate("free", new Term[] {
										new Variable(Type.INTEGER, "N2")
									})
								)
							)
						)
					)
				)
			)
		));
		addInference(new Inference(
			new Predicate("danger", new Term[] {
				new Variable(Type.INTEGER, "N1",false)
			}),
			new AND(
				new Predicate("token", new Term[] {
					new Variable(Type.STRING, "T",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "O",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "T"),
							new Variable(Type.STRING, "O")
						),
						new AND(
							new Predicate("line", new Term[] {
								new Variable(Type.INTEGER, "N1"),
								new Variable(Type.INTEGER, "N2",false),
								new Variable(Type.INTEGER, "N3",false)
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "O"),
									new Variable(Type.INTEGER, "N2")
								}),
								new AND(
									new Predicate("played", new Term[] {
										new Variable(Type.STRING, "O"),
										new Variable(Type.INTEGER, "N3")
									}),
									new Predicate("free", new Term[] {
										new Variable(Type.INTEGER, "N1")
									})
								)
							)
						)
					)
				)
			)
		));
		addInference(new Inference(
			new Predicate("almost", new Term[] {
				new Variable(Type.INTEGER, "N3",false)
			}),
			new AND(
				new Predicate("token", new Term[] {
					new Variable(Type.STRING, "T",false)
				}),
				new AND(
					new Predicate("line", new Term[] {
						new Variable(Type.INTEGER, "N1",false),
						new Variable(Type.INTEGER, "N2",false),
						new Variable(Type.INTEGER, "N3")
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "T"),
							new Variable(Type.INTEGER, "N1")
						}),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "T"),
								new Variable(Type.INTEGER, "N2")
							}),
							new Predicate("free", new Term[] {
								new Variable(Type.INTEGER, "N3")
							})
						)
					)
				)
			)
		));
		addInference(new Inference(
			new Predicate("almost", new Term[] {
				new Variable(Type.INTEGER, "N2",false)
			}),
			new AND(
				new Predicate("token", new Term[] {
					new Variable(Type.STRING, "T",false)
				}),
				new AND(
					new Predicate("line", new Term[] {
						new Variable(Type.INTEGER, "N1",false),
						new Variable(Type.INTEGER, "N2"),
						new Variable(Type.INTEGER, "N3",false)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "T"),
							new Variable(Type.INTEGER, "N1")
						}),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "T"),
								new Variable(Type.INTEGER, "N3")
							}),
							new Predicate("free", new Term[] {
								new Variable(Type.INTEGER, "N2")
							})
						)
					)
				)
			)
		));
		addInference(new Inference(
			new Predicate("almost", new Term[] {
				new Variable(Type.INTEGER, "N1",false)
			}),
			new AND(
				new Predicate("token", new Term[] {
					new Variable(Type.STRING, "T",false)
				}),
				new AND(
					new Predicate("line", new Term[] {
						new Variable(Type.INTEGER, "N1"),
						new Variable(Type.INTEGER, "N2",false),
						new Variable(Type.INTEGER, "N3",false)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "T"),
							new Variable(Type.INTEGER, "N2")
						}),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "T"),
								new Variable(Type.INTEGER, "N3")
							}),
							new Predicate("free", new Term[] {
								new Variable(Type.INTEGER, "N1")
							})
						)
					)
				)
			)
		));
		addRule(new Rule(
			"Better", new int[] {23,9,23,40},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("almost", new Term[] {
				new Variable(Type.INTEGER, "A",false)
			}),
			new Block(
				"Better", new int[] {23,39,23,47},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {23,41,23,47},
						new Variable(Type.INTEGER, "A")
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {25,9,25,40},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("danger", new Term[] {
				new Variable(Type.INTEGER, "D",false)
			}),
			new Block(
				"Better", new int[] {25,39,25,46},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {25,41,25,46},
						new Variable(Type.INTEGER, "D")
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {28,9,28,108},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("token", new Term[] {
					new Variable(Type.STRING, "T",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "O",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "T"),
							new Variable(Type.STRING, "O")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "O"),
								Primitive.newPrimitive(1)
							}),
							new AND(
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(5)
								}),
								new Predicate("first", new Term[] {
									Primitive.newPrimitive(false)
								})
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {28,107,28,114},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {28,109,28,114},
						Primitive.newPrimitive(5)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {29,9,29,108},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("token", new Term[] {
					new Variable(Type.STRING, "T",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "O",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "T"),
							new Variable(Type.STRING, "O")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "O"),
								Primitive.newPrimitive(3)
							}),
							new AND(
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(5)
								}),
								new Predicate("first", new Term[] {
									Primitive.newPrimitive(false)
								})
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {29,107,29,114},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {29,109,29,114},
						Primitive.newPrimitive(5)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {30,9,30,108},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("token", new Term[] {
					new Variable(Type.STRING, "T",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "O",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "T"),
							new Variable(Type.STRING, "O")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "O"),
								Primitive.newPrimitive(7)
							}),
							new AND(
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(5)
								}),
								new Predicate("first", new Term[] {
									Primitive.newPrimitive(false)
								})
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {30,107,30,114},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {30,109,30,114},
						Primitive.newPrimitive(5)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {31,9,31,108},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("token", new Term[] {
					new Variable(Type.STRING, "T",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "O",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "T"),
							new Variable(Type.STRING, "O")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "O"),
								Primitive.newPrimitive(9)
							}),
							new AND(
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(5)
								}),
								new Predicate("first", new Term[] {
									Primitive.newPrimitive(false)
								})
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {31,107,31,114},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {31,109,31,114},
						Primitive.newPrimitive(5)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {34,9,34,116},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("token", new Term[] {
					new Variable(Type.STRING, "T",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "O",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "T"),
							new Variable(Type.STRING, "O")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "O"),
								Primitive.newPrimitive(1)
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "O"),
									Primitive.newPrimitive(9)
								}),
								new AND(
									new Predicate("free", new Term[] {
										Primitive.newPrimitive(3)
									}),
									new Predicate("free", new Term[] {
										Primitive.newPrimitive(7)
									})
								)
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {34,115,34,121},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {34,117,34,121},
						Primitive.newPrimitive(2)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {35,9,35,116},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("token", new Term[] {
					new Variable(Type.STRING, "T",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "O",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "T"),
							new Variable(Type.STRING, "O")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "O"),
								Primitive.newPrimitive(3)
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "O"),
									Primitive.newPrimitive(7)
								}),
								new AND(
									new Predicate("free", new Term[] {
										Primitive.newPrimitive(1)
									}),
									new Predicate("free", new Term[] {
										Primitive.newPrimitive(9)
									})
								)
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {35,115,35,121},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {35,117,35,121},
						Primitive.newPrimitive(2)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {38,9,38,51},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("free", new Term[] {
					Primitive.newPrimitive(9)
				}),
				new AND(
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(8)
					}),
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(6)
					})
				)
			),
			new Block(
				"Better", new int[] {38,50,38,57},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {38,52,38,57},
						Primitive.newPrimitive(9)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {39,9,39,51},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("free", new Term[] {
					Primitive.newPrimitive(7)
				}),
				new AND(
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(4)
					}),
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(8)
					})
				)
			),
			new Block(
				"Better", new int[] {39,50,39,57},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {39,52,39,57},
						Primitive.newPrimitive(7)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {40,9,40,51},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("free", new Term[] {
					Primitive.newPrimitive(3)
				}),
				new AND(
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(2)
					}),
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(6)
					})
				)
			),
			new Block(
				"Better", new int[] {40,50,40,57},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {40,52,40,57},
						Primitive.newPrimitive(3)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {41,9,41,51},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("free", new Term[] {
					Primitive.newPrimitive(1)
				}),
				new AND(
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(2)
					}),
					new Predicate("free", new Term[] {
						Primitive.newPrimitive(4)
					})
				)
			),
			new Block(
				"Better", new int[] {41,50,41,57},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {41,52,41,57},
						Primitive.newPrimitive(1)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {44,9,44,33},
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
				"Better", new int[] {44,32,44,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {44,34,44,39},
						Primitive.newPrimitive(9)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {45,9,45,33},
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
				"Better", new int[] {45,32,45,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {45,34,45,39},
						Primitive.newPrimitive(1)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {46,9,46,33},
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
				"Better", new int[] {46,32,46,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {46,34,46,39},
						Primitive.newPrimitive(7)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {47,9,47,33},
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
				"Better", new int[] {47,32,47,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {47,34,47,39},
						Primitive.newPrimitive(3)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {50,9,50,33},
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
				"Better", new int[] {50,32,50,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {50,34,50,39},
						Primitive.newPrimitive(2)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {51,9,51,33},
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
				"Better", new int[] {51,32,51,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {51,34,51,39},
						Primitive.newPrimitive(4)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {52,9,52,33},
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
				"Better", new int[] {52,32,52,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {52,34,52,39},
						Primitive.newPrimitive(5)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {53,9,53,33},
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
				"Better", new int[] {53,32,53,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {53,34,53,39},
						Primitive.newPrimitive(6)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {54,9,54,33},
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
				"Better", new int[] {54,32,54,39},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {54,34,54,39},
						Primitive.newPrimitive(8)
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
			astra.core.Agent agent = new Better().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
