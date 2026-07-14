package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(myfirstmodule.actions.GetClassPath.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
    registrator.registerUserAction(userlibconflictchecker.actions.AnalyzeUserlib.class);
    registrator.registerUserAction(userlibconflictchecker.actions.AnalyzeWidgets.class);
  }
}
