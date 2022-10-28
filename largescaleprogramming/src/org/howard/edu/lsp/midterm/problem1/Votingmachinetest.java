package org.howard.edu.lsp.midterm.problem1;
import org.junit.jupiter.api.DisplayName;


public class Votingmachinetest {
	
	
	public class votingMachineTest extends junit.framework.TestCase {
		private static votingMachine candidates;
		
		
		public void tearDown() {}
		
		public void getvotestestcase() {
			//Set up default test sets for every new test
			// candidates = ["John", "Casey", "Dennis", "Greg"]
			candidates = new votingMachine();
			
			candidates.addCandidate("John");
			candidates.addCandidate("Casey");
			candidates.addCandidate("Dennis");
			candidates.addCandidate("Greg");
			candidates.castVotes("John", 4);
			candidates.castVotes("Casey", 6);
			candidates.castVotes("Dennis", 2);
		}
		

		
		@Test
		@DisplayName("Test case for getVotes function")
		public void testGetVotes() throws UnknownCandidateException {
			assertEquals(candidates.getVotes("John"),4);
			assertEquals(candidates.getVotes("Casey"),6);
			assertEquals(candidates.getVotes("Dennis"),2);
			assertEquals(candidates.getVotes("Greg"),0);
		}
		
		@Test
		@DisplayName("Test case for sum function")
		public void sumtestcase() {
		
			assertEquals(candidates.sum(),12);
			
			candidates = new votingMachine();
			candidates.addCandidate("John");
			candidates.addCandidate("Casey");
			candidates.addCandidate("Dennis");
			candidates.addCandidate("Greg");
			candidates.castVotes("John", 6);
			candidates.castVotes("Casey", 8);
			candidates.castVotes("Dennis", 3);
			
			assertEquals(candidates.sum(),17);
		}
	}}