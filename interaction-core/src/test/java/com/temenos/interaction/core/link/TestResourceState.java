package com.temenos.interaction.core.link;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class TestResourceState {

	@Test
	public void testCollection() {
		ResourceState begin = new ResourceState("begin", "");
		ResourceState exists = new ResourceState("exists", "{id}");
		ResourceState end = new ResourceState("end", "");
		
		Set<ResourceState> states = new HashSet<ResourceState>();
		states.add(begin);
		states.add(exists);
		states.add(end);

		Set<ResourceState> states2 = new HashSet<ResourceState>();
		states2.add(begin);
		states2.add(exists);
		states2.add(end);
		
		states.removeAll(states2);
		assertEquals(0, states.size());
	}

/*
	@Test
	public void testInteractions() {
		ResourceState begin = new ResourceState("begin");
		ResourceState exists = new ResourceState("exists");
		ResourceState end = new ResourceState("end");
		
		begin.addTransition(new TransitionCommandSpec("PUT", "{id}"), exists);
		exists.addTransition(new TransitionCommandSpec("DELETE", "{id}"), end);
		
		assertEquals(0, begin.getInteractions().size());
		assertEquals(1, exists.getInteractions().size());
		assertTrue(exists.getInteractions().contains("PUT"));
		assertEquals(1, end.getInteractions().size());
		assertTrue(end.getInteractions().contains("DELETE"));
	}
*/
	
	@Test
	public void testGetCommand() {
		ResourceState begin = new ResourceState("begin", "");
		ResourceState exists = new ResourceState("exists", "{id}");
		begin.addTransition(new TransitionCommandSpec("PUT", "{id}"), exists);
		assertEquals("PUT", begin.getTransition(exists).getCommand().getMethod());
		assertEquals("{id}", begin.getTransition(exists).getCommand().getPath());
	}

	@Test
	public void testEquality() {
		ResourceState begin = new ResourceState("begin", "");
		ResourceState begin2 = new ResourceState("begin", "");
		assertEquals(begin, begin2);
		assertEquals(begin.hashCode(), begin2.hashCode());
	}

	@Test
	public void testInequality() {
		ResourceState begin = new ResourceState("begin", "");
		ResourceState end = new ResourceState("end", "");
		assertFalse(begin.equals(end));
		assertFalse(begin.hashCode() == end.hashCode());
	}
	
	@Test
	public void testEndState() {
		ResourceState begin = new ResourceState("begin", "");
		ResourceState end = new ResourceState("end", "");
		begin.addTransition(new TransitionCommandSpec("DELETE", "noop"), end);
		assertFalse(begin.isFinalState());
		assertTrue(end.isFinalState());
	}

}