import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * CSVViewer
 */
public class MainActivity {

  private Shell shell;
  private Display display;

  public Shell open(Display display) {
    this.display = display;
    shell = new Shell(display);    // （2）
    shell.setText("CSVViewer");

    shell.open();        // （6）
    return shell;
  }

  public static void main(String[] args) {
    Display display = new Display();  // （1）

    MainActivity viewer = new MainActivity();
    Shell shell = viewer.open(display);

    // ウィンドウが破棄されるまでループ
    while (!shell.isDisposed()) {    // （7）
      if (!display.readAndDispatch())
        display.sleep();
    }
    display.dispose();      // (8)
  }
}
