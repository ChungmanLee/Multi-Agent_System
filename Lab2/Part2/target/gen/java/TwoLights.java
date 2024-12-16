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


public class TwoLights extends ASTRAClass {
	public TwoLights() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"TwoLights", new int[] {22,9,22,28},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					new Variable(Type.STRING, "S",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"TwoLights", new int[] {22,27,25,5},
				new Statement[] {
					new Subgoal(
						"TwoLights", new int[] {23,8,25,5},
						new Goal(
							new Predicate("light", new Term[] {
								Primitive.newPrimitive("l1"),
								new Variable(Type.STRING, "S")
							})
						)
					),
					new Subgoal(
						"TwoLights", new int[] {24,8,25,5},
						new Goal(
							new Predicate("light", new Term[] {
								Primitive.newPrimitive("l2"),
								new Variable(Type.STRING, "S")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"TwoLights", new int[] {28,9,28,78},
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
				"TwoLights", new int[] {28,77,33,5},
				new Statement[] {
					new ModuleCall("console",
						"TwoLights", new int[] {29,8,29,61},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Light: "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "L"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" is in state: "),
										new Variable(Type.STRING, "R")
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("TwoLights","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"TwoLights", new int[] {30,8,33,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "L"),
							new Variable(Type.STRING, "R")
						})
					),
					new BeliefUpdate('+',
						"TwoLights", new int[] {31,8,33,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "L"),
							new Variable(Type.STRING, "S")
						})
					),
					new ModuleCall("console",
						"TwoLights", new int[] {32,8,32,61},
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
								return ((astra.lang.Console) intention.getModule("TwoLights","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"TwoLights", new int[] {37,9,37,38},
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
				"TwoLights", new int[] {37,37,39,5},
				new Statement[] {
					new ModuleCall("console",
						"TwoLights", new int[] {38,8,38,60},
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
								return ((astra.lang.Console) intention.getModule("TwoLights","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"TwoLights", new int[] {54,9,54,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"TwoLights", new int[] {54,27,56,5},
				new Statement[] {
					new BeliefUpdate('+',
						"TwoLights", new int[] {55,8,56,5},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("on")
						})
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.initialize(
			new Predicate("switch", new Term[] {
				Primitive.newPrimitive("on")
			})
		);
		agent.initialize(
			new Predicate("light", new Term[] {
				Primitive.newPrimitive("l1"),
				Primitive.newPrimitive("on")
			})
		);
		agent.initialize(
			new Predicate("light", new Term[] {
				Primitive.newPrimitive("l2"),
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
			astra.core.Agent agent = new TwoLights().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
