package main.intergalactic;

/* InputClassifier class validate various type of input
 */

public class Validator
{
        //regex validation
        final String Much="([h|H]ow much is)(\\s+)(.*)?";
        final String Many = "([H|h]ow many [C|c]redits is )(.*)?";
	final String Credit="([a-z|A-Z]*(\\s+))*(is)(\\s+)(\\d+)(\\s+)([C|c]redits)";
	final String Assignment="[a-z|A-Z]*(\\s+)(is)(\\s+)[(I||V|X|L|C|D|M]*";
	
	
	
	public boolean isHowMuchType(String line)
	{
		return line.matches(Much);
	}
        public boolean isHowManyType(String line)
	{
		return line.matches(Many);
	}
	public boolean isCommodityCreditType(String line)
	{
	   return line.matches(Credit);
	}	
	
        public boolean isAssignmentType(String line)
	{
	   return line.matches(Assignment);	
    }
}