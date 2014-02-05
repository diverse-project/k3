/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.mopp;

public class RobotSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			robot.robot.RobotPackage.eINSTANCE.getProgramUnit(),
			robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getAndExp(),
			robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getNegExp(),
			robot.robot.RobotPackage.eINSTANCE.getHasTurnedCmd(),
			robot.robot.RobotPackage.eINSTANCE.getObstacleCmd(),
			robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(),
			robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(),
			robot.robot.RobotPackage.eINSTANCE.getBip(),
			robot.robot.RobotPackage.eINSTANCE.getMoveCmd(),
			robot.robot.RobotPackage.eINSTANCE.getPrintCmd(),
			robot.robot.RobotPackage.eINSTANCE.getSetTurnAngleCmd(),
			robot.robot.RobotPackage.eINSTANCE.getStopEngineCmd(),
			robot.robot.RobotPackage.eINSTANCE.getStopProgramCmd(),
			robot.robot.RobotPackage.eINSTANCE.getTurnCmd(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			robot.robot.RobotPackage.eINSTANCE.getProgramUnit(),
		};
	}
	
}
