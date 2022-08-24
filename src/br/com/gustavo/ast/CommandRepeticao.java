package br.com.gustavo.ast;

import java.util.ArrayList;

public class CommandRepeticao extends AbstractCommand{

	private String condition;
	private ArrayList<AbstractCommand> _listaCmds;
	
	public CommandRepeticao(String condition, ArrayList<AbstractCommand> listaCmds) {
		this.condition = condition;
		this._listaCmds = listaCmds;
	}
	@Override
	public String generateJavaCode() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("while (" + condition + ") {\n");
		for(AbstractCommand cmd: _listaCmds) {
			sb.append("\n " + cmd.generateJavaCode());
		}
		sb.append("\n}\n");
		return sb.toString();
	}
	@Override
	public String toString() {
		return "CommandRepeticao [condition=" + condition + ", _listaCmds=" + _listaCmds + "]";
	}

}
