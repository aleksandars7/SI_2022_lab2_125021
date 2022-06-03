import static org.junit.jupiter.api.Assertions.*;

@Test
void EveryBranchTest(){
        List<String> case1=List.of();
        List<String> case2=List.of("0","#");
        List<String> case3=List.of("0","#","0","#","0","#","0","#","#");
        List<String> case3out=List.of("2","#","2","#","4","#","2","#","#");
        IllegalArgumentException illegalGreater,illegalPerfect;

        illegalGreater=assertThrows(IllegalArgumentException.class,()->SILab2.function(case1));
        assertTrue(illegalGreater.getMessage().contains("List lenght should be greater than 0"));
        illegalPerfect=assertThrows(IllegalArgumentException.class,()->SILab2.function(case2));
        assertTrue(illegalGreater.getMessage().contains("List lenght should be a perfect square"));
        assertEquals(SILab2.function(case3),case3out);
        }