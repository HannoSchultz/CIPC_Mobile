/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("ComponentGroup", com.codename1.ui.ComponentGroup.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("Picker", com.codename1.ui.spinner.Picker.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("MapComponent", com.codename1.maps.MapComponent.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("MultiButton", com.codename1.components.MultiButton.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("ComponentGroup", com.codename1.ui.ComponentGroup.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("Picker", com.codename1.ui.spinner.Picker.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("MapComponent", com.codename1.maps.MapComponent.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("MultiButton", com.codename1.components.MultiButton.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Label findLabel11(Component root) {
        return (com.codename1.ui.Label)findByName("Label11", root);
    }

    public com.codename1.ui.Label findLabel11() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label11", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label11", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findMultiButton4(Component root) {
        return (com.codename1.components.MultiButton)findByName("MultiButton4", root);
    }

    public com.codename1.components.MultiButton findMultiButton4() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("MultiButton4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("MultiButton4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel12(Component root) {
        return (com.codename1.ui.Label)findByName("Label12", root);
    }

    public com.codename1.ui.Label findLabel12() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label12", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label12", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findMultiButton3(Component root) {
        return (com.codename1.components.MultiButton)findByName("MultiButton3", root);
    }

    public com.codename1.components.MultiButton findMultiButton3() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("MultiButton3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("MultiButton3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComponentGroup findComponentGroup(Component root) {
        return (com.codename1.ui.ComponentGroup)findByName("ComponentGroup", root);
    }

    public com.codename1.ui.ComponentGroup findComponentGroup() {
        com.codename1.ui.ComponentGroup cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea", root);
    }

    public com.codename1.ui.TextArea findTextArea() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnValidate(Component root) {
        return (com.codename1.ui.Button)findByName("btn_validate", root);
    }

    public com.codename1.ui.Button findBtnValidate() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btn_validate", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btn_validate", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComponentGroup findComponentGroup1(Component root) {
        return (com.codename1.ui.ComponentGroup)findByName("ComponentGroup1", root);
    }

    public com.codename1.ui.ComponentGroup findComponentGroup1() {
        com.codename1.ui.ComponentGroup cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer3(Component root) {
        return (com.codename1.ui.Container)findByName("Container3", root);
    }

    public com.codename1.ui.Container findContainer3() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer4(Component root) {
        return (com.codename1.ui.Container)findByName("Container4", root);
    }

    public com.codename1.ui.Container findContainer4() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer1(Component root) {
        return (com.codename1.ui.Container)findByName("Container1", root);
    }

    public com.codename1.ui.Container findContainer1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer2(Component root) {
        return (com.codename1.ui.Container)findByName("Container2", root);
    }

    public com.codename1.ui.Container findContainer2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findMultiButton2(Component root) {
        return (com.codename1.components.MultiButton)findByName("MultiButton2", root);
    }

    public com.codename1.components.MultiButton findMultiButton2() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("MultiButton2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("MultiButton2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findMultiButton1(Component root) {
        return (com.codename1.components.MultiButton)findByName("MultiButton1", root);
    }

    public com.codename1.components.MultiButton findMultiButton1() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("MultiButton1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("MultiButton1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBtnValNumber(Component root) {
        return (com.codename1.ui.Button)findByName("btnValNumber", root);
    }

    public com.codename1.ui.Button findBtnValNumber() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("btnValNumber", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("btnValNumber", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton(Component root) {
        return (com.codename1.ui.Button)findByName("Button", root);
    }

    public com.codename1.ui.Button findButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLBLentdetail(Component root) {
        return (com.codename1.ui.Label)findByName("LBLentdetail", root);
    }

    public com.codename1.ui.Label findLBLentdetail() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("LBLentdetail", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("LBLentdetail", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.maps.MapComponent findMapComponent(Component root) {
        return (com.codename1.maps.MapComponent)findByName("MapComponent", root);
    }

    public com.codename1.maps.MapComponent findMapComponent() {
        com.codename1.maps.MapComponent cmp = (com.codename1.maps.MapComponent)findByName("MapComponent", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.maps.MapComponent)findByName("MapComponent", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComponentGroup findComponentGroup2(Component root) {
        return (com.codename1.ui.ComponentGroup)findByName("ComponentGroup2", root);
    }

    public com.codename1.ui.ComponentGroup findComponentGroup2() {
        com.codename1.ui.ComponentGroup cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxttype(Component root) {
        return (com.codename1.ui.TextField)findByName("txttype", root);
    }

    public com.codename1.ui.TextField findTxttype() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("txttype", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("txttype", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBchangeofname(Component root) {
        return (com.codename1.ui.Button)findByName("Bchangeofname", root);
    }

    public com.codename1.ui.Button findBchangeofname() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Bchangeofname", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Bchangeofname", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findMultiButton(Component root) {
        return (com.codename1.components.MultiButton)findByName("MultiButton", root);
    }

    public com.codename1.components.MultiButton findMultiButton() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("MultiButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("MultiButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtnameno(Component root) {
        return (com.codename1.ui.TextField)findByName("txtnameno", root);
    }

    public com.codename1.ui.TextField findTxtnameno() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("txtnameno", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("txtnameno", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtyear(Component root) {
        return (com.codename1.ui.TextField)findByName("txtyear", root);
    }

    public com.codename1.ui.TextField findTxtyear() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("txtyear", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("txtyear", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Tabs findTabs1(Component root) {
        return (com.codename1.ui.Tabs)findByName("Tabs1", root);
    }

    public com.codename1.ui.Tabs findTabs1() {
        com.codename1.ui.Tabs cmp = (com.codename1.ui.Tabs)findByName("Tabs1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Tabs)findByName("Tabs1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findResolutionDate(Component root) {
        return (com.codename1.ui.Label)findByName("Resolution Date", root);
    }

    public com.codename1.ui.Label findResolutionDate() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Resolution Date", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Resolution Date", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel1(Component root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel2(Component root) {
        return (com.codename1.ui.Label)findByName("Label2", root);
    }

    public com.codename1.ui.Label findLabel2() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.spinner.Picker findResdate(Component root) {
        return (com.codename1.ui.spinner.Picker)findByName("resdate", root);
    }

    public com.codename1.ui.spinner.Picker findResdate() {
        com.codename1.ui.spinner.Picker cmp = (com.codename1.ui.spinner.Picker)findByName("resdate", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.spinner.Picker)findByName("resdate", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findBfye(Component root) {
        return (com.codename1.ui.Button)findByName("Bfye", root);
    }

    public com.codename1.ui.Button findBfye() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Bfye", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Bfye", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Tabs findTabs(Component root) {
        return (com.codename1.ui.Tabs)findByName("Tabs", root);
    }

    public com.codename1.ui.Tabs findTabs() {
        com.codename1.ui.Tabs cmp = (com.codename1.ui.Tabs)findByName("Tabs", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Tabs)findByName("Tabs", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTxtbody(Component root) {
        return (com.codename1.ui.TextField)findByName("txtbody", root);
    }

    public com.codename1.ui.TextField findTxtbody() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("txtbody", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("txtbody", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_MainChangeOfName = 20;
    public static final int COMMAND_MainChangeFYE = 19;
    public static final int COMMAND_MainButton = 21;

    protected boolean onMainChangeOfName() {
        return false;
    }

    protected boolean onMainChangeFYE() {
        return false;
    }

    protected boolean onMainButton() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_MainChangeOfName:
                if(onMainChangeOfName()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainChangeFYE:
                if(onMainChangeFYE()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainButton:
                if(onMainButton()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("ChangeNameContinue".equals(f.getName())) {
            exitChangeNameContinue(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ChangeName".equals(f.getName())) {
            exitChangeName(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ChangeFYE".equals(f.getName())) {
            exitChangeFYE(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Co Registration".equals(f.getName())) {
            exitCoRegistration(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("COREG".equals(f.getName())) {
            exitCOREG(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitChangeNameContinue(Form f) {
    }


    protected void exitChangeName(Form f) {
    }


    protected void exitMain(Form f) {
    }


    protected void exitChangeFYE(Form f) {
    }


    protected void exitCoRegistration(Form f) {
    }


    protected void exitCOREG(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("ChangeNameContinue".equals(f.getName())) {
            beforeChangeNameContinue(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ChangeName".equals(f.getName())) {
            beforeChangeName(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ChangeFYE".equals(f.getName())) {
            beforeChangeFYE(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Co Registration".equals(f.getName())) {
            beforeCoRegistration(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("COREG".equals(f.getName())) {
            beforeCOREG(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeChangeNameContinue(Form f) {
    }


    protected void beforeChangeName(Form f) {
    }


    protected void beforeMain(Form f) {
    }


    protected void beforeChangeFYE(Form f) {
    }


    protected void beforeCoRegistration(Form f) {
    }


    protected void beforeCOREG(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("ChangeNameContinue".equals(c.getName())) {
            beforeContainerChangeNameContinue(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ChangeName".equals(c.getName())) {
            beforeContainerChangeName(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ChangeFYE".equals(c.getName())) {
            beforeContainerChangeFYE(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Co Registration".equals(c.getName())) {
            beforeContainerCoRegistration(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("COREG".equals(c.getName())) {
            beforeContainerCOREG(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerChangeNameContinue(Container c) {
    }


    protected void beforeContainerChangeName(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }


    protected void beforeContainerChangeFYE(Container c) {
    }


    protected void beforeContainerCoRegistration(Container c) {
    }


    protected void beforeContainerCOREG(Container c) {
    }

    protected void postShow(Form f) {
        if("ChangeNameContinue".equals(f.getName())) {
            postChangeNameContinue(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ChangeName".equals(f.getName())) {
            postChangeName(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ChangeFYE".equals(f.getName())) {
            postChangeFYE(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Co Registration".equals(f.getName())) {
            postCoRegistration(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("COREG".equals(f.getName())) {
            postCOREG(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postChangeNameContinue(Form f) {
    }


    protected void postChangeName(Form f) {
    }


    protected void postMain(Form f) {
    }


    protected void postChangeFYE(Form f) {
    }


    protected void postCoRegistration(Form f) {
    }


    protected void postCOREG(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("ChangeNameContinue".equals(c.getName())) {
            postContainerChangeNameContinue(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ChangeName".equals(c.getName())) {
            postContainerChangeName(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ChangeFYE".equals(c.getName())) {
            postContainerChangeFYE(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Co Registration".equals(c.getName())) {
            postContainerCoRegistration(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("COREG".equals(c.getName())) {
            postContainerCOREG(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerChangeNameContinue(Container c) {
    }


    protected void postContainerChangeName(Container c) {
    }


    protected void postContainerMain(Container c) {
    }


    protected void postContainerChangeFYE(Container c) {
    }


    protected void postContainerCoRegistration(Container c) {
    }


    protected void postContainerCOREG(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("ChangeNameContinue".equals(rootName)) {
            onCreateChangeNameContinue();
            aboutToShowThisContainer = null;
            return;
        }

        if("ChangeName".equals(rootName)) {
            onCreateChangeName();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

        if("ChangeFYE".equals(rootName)) {
            onCreateChangeFYE();
            aboutToShowThisContainer = null;
            return;
        }

        if("Co Registration".equals(rootName)) {
            onCreateCoRegistration();
            aboutToShowThisContainer = null;
            return;
        }

        if("COREG".equals(rootName)) {
            onCreateCOREG();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateChangeNameContinue() {
    }


    protected void onCreateChangeName() {
    }


    protected void onCreateMain() {
    }


    protected void onCreateChangeFYE() {
    }


    protected void onCreateCoRegistration() {
    }


    protected void onCreateCOREG() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("ChangeNameContinue".equals(f.getName())) {
            getStateChangeNameContinue(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("ChangeName".equals(f.getName())) {
            getStateChangeName(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("ChangeFYE".equals(f.getName())) {
            getStateChangeFYE(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Co Registration".equals(f.getName())) {
            getStateCoRegistration(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("COREG".equals(f.getName())) {
            getStateCOREG(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateChangeNameContinue(Form f, Hashtable h) {
    }


    protected void getStateChangeName(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }


    protected void getStateChangeFYE(Form f, Hashtable h) {
    }


    protected void getStateCoRegistration(Form f, Hashtable h) {
    }


    protected void getStateCOREG(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("ChangeNameContinue".equals(f.getName())) {
            setStateChangeNameContinue(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("ChangeName".equals(f.getName())) {
            setStateChangeName(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("ChangeFYE".equals(f.getName())) {
            setStateChangeFYE(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Co Registration".equals(f.getName())) {
            setStateCoRegistration(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("COREG".equals(f.getName())) {
            setStateCOREG(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateChangeNameContinue(Form f, Hashtable state) {
    }


    protected void setStateChangeName(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }


    protected void setStateChangeFYE(Form f, Hashtable state) {
    }


    protected void setStateCoRegistration(Form f, Hashtable state) {
    }


    protected void setStateCOREG(Form f, Hashtable state) {
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("ChangeName")) {
            if("txtyear".equals(c.getName())) {
                onChangeName_TxtyearAction(c, event);
                return;
            }
            if("txtbody".equals(c.getName())) {
                onChangeName_TxtbodyAction(c, event);
                return;
            }
            if("txttype".equals(c.getName())) {
                onChangeName_TxttypeAction(c, event);
                return;
            }
            if("resdate".equals(c.getName())) {
                onChangeName_ResdateAction(c, event);
                return;
            }
            if("txtnameno".equals(c.getName())) {
                onChangeName_TxtnamenoAction(c, event);
                return;
            }
            if("btn_validate".equals(c.getName())) {
                onChangeName_BtnValidateAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("Bchangeofname".equals(c.getName())) {
                onMain_BchangeofnameAction(c, event);
                return;
            }
            if("Bfye".equals(c.getName())) {
                onMain_BfyeAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onMain_ButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("ChangeFYE")) {
            if("txtyear".equals(c.getName())) {
                onChangeFYE_TxtyearAction(c, event);
                return;
            }
            if("txtbody".equals(c.getName())) {
                onChangeFYE_TxtbodyAction(c, event);
                return;
            }
            if("txttype".equals(c.getName())) {
                onChangeFYE_TxttypeAction(c, event);
                return;
            }
            if("btnValNumber".equals(c.getName())) {
                onChangeFYE_BtnValNumberAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Co Registration")) {
            if("Button".equals(c.getName())) {
                onCoRegistration_ButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("COREG")) {
            if("TextArea".equals(c.getName())) {
                onCOREG_TextAreaAction(c, event);
                return;
            }
            if("MultiButton".equals(c.getName())) {
                onCOREG_MultiButtonAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onCOREG_ButtonAction(c, event);
                return;
            }
            if("MultiButton2".equals(c.getName())) {
                onCOREG_MultiButton2Action(c, event);
                return;
            }
            if("MultiButton4".equals(c.getName())) {
                onCOREG_MultiButton4Action(c, event);
                return;
            }
            if("MultiButton1".equals(c.getName())) {
                onCOREG_MultiButton1Action(c, event);
                return;
            }
            if("MultiButton3".equals(c.getName())) {
                onCOREG_MultiButton3Action(c, event);
                return;
            }
        }
    }

      protected void onChangeName_TxtyearAction(Component c, ActionEvent event) {
      }

      protected void onChangeName_TxtbodyAction(Component c, ActionEvent event) {
      }

      protected void onChangeName_TxttypeAction(Component c, ActionEvent event) {
      }

      protected void onChangeName_ResdateAction(Component c, ActionEvent event) {
      }

      protected void onChangeName_TxtnamenoAction(Component c, ActionEvent event) {
      }

      protected void onChangeName_BtnValidateAction(Component c, ActionEvent event) {
      }

      protected void onMain_BchangeofnameAction(Component c, ActionEvent event) {
      }

      protected void onMain_BfyeAction(Component c, ActionEvent event) {
      }

      protected void onMain_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onChangeFYE_TxtyearAction(Component c, ActionEvent event) {
      }

      protected void onChangeFYE_TxtbodyAction(Component c, ActionEvent event) {
      }

      protected void onChangeFYE_TxttypeAction(Component c, ActionEvent event) {
      }

      protected void onChangeFYE_BtnValNumberAction(Component c, ActionEvent event) {
      }

      protected void onCoRegistration_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onCOREG_TextAreaAction(Component c, ActionEvent event) {
      }

      protected void onCOREG_MultiButtonAction(Component c, ActionEvent event) {
      }

      protected void onCOREG_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onCOREG_MultiButton2Action(Component c, ActionEvent event) {
      }

      protected void onCOREG_MultiButton4Action(Component c, ActionEvent event) {
      }

      protected void onCOREG_MultiButton1Action(Component c, ActionEvent event) {
      }

      protected void onCOREG_MultiButton3Action(Component c, ActionEvent event) {
      }

}
