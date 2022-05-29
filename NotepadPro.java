import java.awt.*;
class Notepad
{
	Frame f;
	MenuBar mb;
	TextArea ta;
	Menu mFile,mEdit,mFormat,mHelp;
	MenuItem miNew,miOpen,miSave,miPrint;
	MenuItem EditUndo,EditRedo,EditCut,EditCopy,EditPaste,EditDelete,EditInsert,EditIndent,EditComment;
	MenuItem fWordwrap,fFont;
	MenuItem viewHelp,sendFeedback,aboutNotepad;
	
	public Notepad()
	{
	f= new Frame("Hamro Notepad");
	mb= new MenuBar();
	ta = new TextArea();
	mFile = new Menu("FILE");
	mEdit= new Menu("EDIT");
	mFormat= new Menu("FORMAT");
	mHelp = new Menu("HELP");
						//------menuItems----- //
	//menuItems for file(mFile)
	miNew = new MenuItem("NEW");
	miOpen  = new MenuItem("OPEN");
	miSave = new MenuItem("SAVE");
	miPrint = new MenuItem("PRINT");
	
	//menuItems for Edit (mEdit)
	EditUndo = new MenuItem("UNDO");
	EditRedo = new MenuItem("REDO");
	EditCut = new MenuItem("CUT");
	EditCopy = new MenuItem("COPY");
	EditPaste = new MenuItem("PASTE");
	EditDelete = new MenuItem("DELETE");
	EditInsert = new MenuItem("INSERT");
	EditIndent = new MenuItem("INDENT");
	EditComment = new MenuItem("COMMENT");
	
	//menuItems for format
	fWordwrap = new MenuItem("WORDWRAP");
	fFont = new MenuItem("FONT");
	
	//menuitems for Help (mHelp)
	viewHelp = new MenuItem("View Help");
	sendFeedback = new MenuItem("Send Feedback");
	aboutNotepad = new MenuItem("About us");
	
	//adding menu item on respective menu
	
	//adding File menu's menuItems(mFile)
	mFile.add(miNew);
	mFile.add(miOpen);
	mFile.addSeparator();
	mFile.add(miSave);
	mFile.add(miPrint);
	
	//adding Edit's menuItems(mEdit)
	mEdit.add(EditUndo);
	mEdit.add(EditRedo);
	mEdit.add(EditCut);
	mEdit.add(EditCopy);
	mEdit.add(EditPaste);
	mEdit.add(EditDelete);
	mEdit.addSeparator();
	mEdit.add(EditInsert);
	mEdit.add(EditInsert);
	mEdit.add(EditComment);
	
	//adding format's MenuItems(mformat)
	mFormat.add(fWordwrap);
	mFormat.add(fFont);
	
	// adding Help menuitems
	mHelp.add(viewHelp);
	mHelp.add(sendFeedback);
	mHelp.add(aboutNotepad);
	
	mb.add(mFile);
	mb.add(mEdit);
	mb.add(mFormat);
	mb.add(mHelp);
	
	
	mb.setHelpMenu(mHelp);
	f.add(ta);
	f.setMenuBar(mb);
	f.setSize(400,400);
	f.setVisible(true);
	}
}
class NotepadPro
{
	public static void main(String[]args)
	{
		Notepad n= new Notepad();
	}
}