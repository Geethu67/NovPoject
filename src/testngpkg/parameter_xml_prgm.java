package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter_xml_prgm 
{
@Parameters({"tool"})
@Test
public void test(String tool)
{
System.out.println("value="+tool);	
}
}
