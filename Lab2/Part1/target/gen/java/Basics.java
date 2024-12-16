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


public class Basics extends ASTRAClass {
	public Basics() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"Basics", new int[] {19,9,19,28},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					new Variable(Type.STRING, "S",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Basics", new int[] {19,27,21,5},
				new Statement[] {
					new Subgoal(
						"Basics", new int[] {20,8,21,5},
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
			"Basics", new int[] {24,9,24,78},
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
				"Basics", new int[] {24,77,29,5},
				new Statement[] {
					new ModuleCall("console",
						"Basics", new int[] {25,8,25,60},
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
								return ((astra.lang.Console) intention.getModule("Basics","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new BeliefUpdate('-',
						"Basics", new int[] {26,8,29,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "L"),
							new Variable(Type.STRING, "R")
						})
					),
					new BeliefUpdate('+',
						"Basics", new int[] {27,8,29,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "L"),
							new Variable(Type.STRING, "S")
						})
					),
					new ModuleCall("console",
						"Basics", new int[] {28,8,28,60},
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
								return ((astra.lang.Console) intention.getModule("Basics","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Basics", new int[] {32,9,32,38},
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
				"Basics", new int[] {32,37,34,5},
				new Statement[] {
					new ModuleCall("console",
						"Basics", new int[] {33,8,33,60},
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
								return ((astra.lang.Console) intention.getModule("Basics","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Basics", new int[] {49,9,49,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Basics", new int[] {49,27,51,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Basics", new int[] {50,8,51,5},
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
			astra.core.Agent agent = new Basics().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
