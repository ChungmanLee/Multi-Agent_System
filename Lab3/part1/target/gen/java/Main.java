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


public class Main extends ASTRAClass {
	public Main() {
		setParents(new Class[] {Player.class});
		addRule(new Rule(
			"Main", new int[] {22,9,22,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {22,27,34,5},
				new Statement[] {
					new ModuleCall("S",
						"Main", new int[] {23,8,23,20},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","S")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new If(
						"Main", new int[] {24,8,34,5},
						new Predicate("winner", new Term[] {
							new Variable(Type.STRING, "X",false)
						}),
						new ModuleCall("C",
							"Main", new int[] {25,12,25,46},
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
									return ((astra.lang.Console) intention.getModule("Main","C")).println(
										(java.lang.String) intention.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					),
					new If(
						"Main", new int[] {26,8,34,5},
						new Predicate("loser", new Term[] {
							new Variable(Type.STRING, "Y",false)
						}),
						new ModuleCall("C",
							"Main", new int[] {27,12,27,47},
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
									return ((astra.lang.Console) intention.getModule("Main","C")).println(
										(java.lang.String) intention.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					),
					new If(
						"Main", new int[] {28,8,34,5},
						new Predicate("drawn", new Term[] {}),
						new ModuleCall("C",
							"Main", new int[] {29,12,29,31},
							new Predicate("println", new Term[] {
								Primitive.newPrimitive("Drown.")
							}),
							new DefaultModuleCallAdaptor() {
								public boolean inline() {
									return true;
								}

								public boolean invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.Console) intention.getModule("Main","C")).println(
										(java.lang.String) intention.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					),
					new If(
						"Main", new int[] {30,8,34,5},
						new Predicate("free", new Term[] {
							new Variable(Type.INTEGER, "L",false)
						}),
						new ModuleCall("C",
							"Main", new int[] {31,12,31,50},
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
									return ((astra.lang.Console) intention.getModule("Main","C")).println(
										(java.lang.String) intention.evaluate(predicate.getTerm(0))
									);
								}
							}
						)
					),
					new If(
						"Main", new int[] {32,8,34,5},
						new NOT(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "T",false),
								new Variable(Type.INTEGER, "L",false)
							})
						),
						new ModuleCall("C",
							"Main", new int[] {33,12,33,45},
							new Predicate("println", new Term[] {
								Primitive.newPrimitive("Game has not Started")
							}),
							new DefaultModuleCallAdaptor() {
								public boolean inline() {
									return true;
								}

								public boolean invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.Console) intention.getModule("Main","C")).println(
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
			new Predicate("turn", new Term[] {
				Primitive.newPrimitive("O")
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
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
			astra.core.Agent agent = new Main().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
