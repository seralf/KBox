package org.aksw.kbox.kibe;

import java.util.ArrayList;
import java.util.List;

import org.aksw.kbox.kns.KN;
import org.aksw.kbox.kns.KNSVisitor;

public class MockKNSVisitor implements KNSVisitor {
	
	private List<KN> visited = new ArrayList<KN>();

	@Override
	public boolean visit(KN kn) {
		this.visited.add(kn);
		return true;
	}
	
	public List<KN> getKNSVisitedList() {
		return visited;
	}

}
