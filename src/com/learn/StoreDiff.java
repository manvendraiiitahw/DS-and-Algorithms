package com.learn;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StoreDiff {
    public static void main(String[] args) {
//        String s="rxp.s04989.us.wal-mart.com,rxp.s08135.us.wal-mart.com,rxp.s06328.us.wal-mart.com,rxp.s04972.us.wal-mart.com,rxp.s06427.us.wal-mart.com,rxp.s05817.us.wal-mart.com,rxp.s01496.us.wal-mart.com,rxp.s01173.us.wal-mart.com,rxp.s01509.us.wal-mart.com,rxp.s01356.us.wal-mart.com,rxp.s04973.us.wal-mart.com,rxp.s06487.us.wal-mart.com,rxp.s06510.us.wal-mart.com,rxp.s00459.us.wal-mart.com,rxp.s06311.us.wal-mart.com,rxp.s04836.us.wal-mart.com,rxp.s05010.us.wal-mart.com,rxp.s01444.us.wal-mart.com,rxp.s03877.us.wal-mart.com,rxp.s01683.us.wal-mart.com,rxp.s04739.us.wal-mart.com,rxp.s05925.us.wal-mart.com,rxp.s01996.us.wal-mart.com,rxp.s01923.us.wal-mart.com,rxp.s05831.us.wal-mart.com,rxp.s04524.us.wal-mart.com,rxp.s02869.us.wal-mart.com,rxp.s05758.us.wal-mart.com,rxp.s06149.us.wal-mart.com,rxp.s00810.us.wal-mart.com,rxp.s03348.us.wal-mart.com,rxp.s08276.us.wal-mart.com,rxp.s01655.us.wal-mart.com,rxp.s00853.us.wal-mart.com,rxp.s01676.us.wal-mart.com,rxp.s04782.us.wal-mart.com,rxp.s05944.us.wal-mart.com,rxp.s01847.us.wal-mart.com,rxp.s00174.us.wal-mart.com,rxp.s03610.us.wal-mart.com,rxp.s08138.us.wal-mart.com,rxp.s03538.us.wal-mart.com,rxp.s08166.us.wal-mart.com,rxp.s02944.us.wal-mart.com,rxp.s01087.us.wal-mart.com,rxp.s02499.us.wal-mart.com,rxp.s03066.us.wal-mart.com,rxp.s07245.us.wal-mart.com,rxp.s08120.us.wal-mart.com,rxp.s00696.us.wal-mart.com,rxp.s06573.us.wal-mart.com,rxp.s00655.us.wal-mart.com,rxp.s04484.us.wal-mart.com,rxp.s05264.us.wal-mart.com,rxp.s06937.us.wal-mart.com,rxp.s06894.us.wal-mart.com,rxp.s05063.us.wal-mart.com,rxp.s05292.us.wal-mart.com,rxp.s01312.us.wal-mart.com,rxp.s01121.us.wal-mart.com,rxp.s03612.us.wal-mart.com,rxp.s02362.us.wal-mart.com,rxp.s02073.us.wal-mart.com,rxp.s01134.us.wal-mart.com,rxp.s05103.us.wal-mart.com,rxp.s08175.us.wal-mart.com,rxp.s03078.us.wal-mart.com,rxp.s03485.us.wal-mart.com,rxp.s07235.us.wal-mart.com,rxp.s05923.us.wal-mart.com,rxp.s01739.us.wal-mart.com,rxp.s02093.us.wal-mart.com,rxp.s00335.us.wal-mart.com,rxp.s02611.us.wal-mart.com,rxp.s00741.us.wal-mart.com,rxp.s00678.us.wal-mart.com,rxp.s01986.us.wal-mart.com,rxp.s03206.us.wal-mart.com,rxp.s06440.us.wal-mart.com,rxp.s05845.us.wal-mart.com,rxp.s06366.us.wal-mart.com,rxp.s05755.us.wal-mart.com,rxp.s06675.us.wal-mart.com,rxp.s03851.us.wal-mart.com,rxp.s05253.us.wal-mart.com,rxp.s01622.us.wal-mart.com,rxp.s04636.us.wal-mart.com,rxp.s06302.us.wal-mart.com,rxp.s03243.us.wal-mart.com,rxp.s03899.us.wal-mart.com,rxp.s03738.us.wal-mart.com,rxp.s06524.us.wal-mart.com,rxp.s05184.us.wal-mart.com,rxp.s01321.us.wal-mart.com,rxp.s02700.us.wal-mart.com,rxp.s00511.us.wal-mart.com,rxp.s02540.us.wal-mart.com,rxp.s01776.us.wal-mart.com,rxp.s06324.us.wal-mart.com,rxp.s02828.us.wal-mart.com,rxp.s05182.us.wal-mart.com,rxp.s08167.us.wal-mart.com,rxp.s02576.us.wal-mart.com,rxp.s00882.us.wal-mart.com,rxp.s01499.us.wal-mart.com,rxp.s04220.us.wal-mart.com,rxp.s04278.us.wal-mart.com,rxp.s05488.us.wal-mart.com,rxp.s06331.us.wal-mart.com,rxp.s03713.us.wal-mart.com,rxp.s04482.us.wal-mart.com,rxp.s06354.us.wal-mart.com,rxp.s04281.us.wal-mart.com,rxp.s01316.us.wal-mart.com,rxp.s00620.us.wal-mart.com,rxp.s04840.us.wal-mart.com,rxp.s05040.us.wal-mart.com,rxp.s06330.us.wal-mart.com,rxp.s04156.us.wal-mart.com,rxp.s02705.us.wal-mart.com,rxp.s02890.us.wal-mart.com,rxp.s03247.us.wal-mart.com,rxp.s00766.us.wal-mart.com,rxp.s03182.us.wal-mart.com,rxp.s03583.us.wal-mart.com,rxp.s04690.us.wal-mart.com,rxp.s03389.us.wal-mart.com,rxp.s02232.us.wal-mart.com,rxp.s00684.us.wal-mart.com,rxp.s06321.us.wal-mart.com,rxp.s02163.us.wal-mart.com,rxp.s03782.us.wal-mart.com,rxp.s01227.us.wal-mart.com,rxp.s02754.us.wal-mart.com,rxp.s04514.us.wal-mart.com,rxp.s05298.us.wal-mart.com,rxp.s05296.us.wal-mart.com,rxp.s05254.us.wal-mart.com,rxp.s03367.us.wal-mart.com,rxp.s06434.us.wal-mart.com,rxp.s06655.us.wal-mart.com,rxp.s02166.us.wal-mart.com,rxp.s04145.us.wal-mart.com,rxp.s05393.us.wal-mart.com,rxp.s02796.us.wal-mart.com,rxp.s06386.us.wal-mart.com,rxp.s04616.us.wal-mart.com,rxp.s03422.us.wal-mart.com,rxp.s04387.us.wal-mart.com,rxp.s05414.us.wal-mart.com,rxp.s02399.us.wal-mart.com,rxp.s01731.us.wal-mart.com,rxp.s03347.us.wal-mart.com,rxp.s02435.us.wal-mart.com,rxp.s02043.us.wal-mart.com,rxp.s01781.us.wal-mart.com,rxp.s02749.us.wal-mart.com,rxp.s06540.us.wal-mart.com,rxp.s01940.us.wal-mart.com,rxp.s01857.us.wal-mart.com,rxp.s02758.us.wal-mart.com,rxp.s03458.us.wal-mart.com,rxp.s02092.us.wal-mart.com,rxp.s00886.us.wal-mart.com,rxp.s01448.us.wal-mart.com,rxp.s06575.us.wal-mart.com,rxp.s04258.us.wal-mart.com,rxp.s01159.us.wal-mart.com,rxp.s02597.us.wal-mart.com,rxp.s02647.us.wal-mart.com,rxp.s02530.us.wal-mart.com,rxp.s02240.us.wal-mart.com,rxp.s02065.us.wal-mart.com,rxp.s04771.us.wal-mart.com,rxp.s03074.us.wal-mart.com,rxp.s05815.us.wal-mart.com,rxp.s00941.us.wal-mart.com,rxp.s05379.us.wal-mart.com,rxp.s02935.us.wal-mart.com,rxp.s03803.us.wal-mart.com,rxp.s01314.us.wal-mart.com,rxp.s00937.us.wal-mart.com,rxp.s05251.us.wal-mart.com,rxp.s06789.us.wal-mart.com,rxp.s02120.us.wal-mart.com,rxp.s07266.us.wal-mart.com,rxp.s07254.us.wal-mart.com";
        String s="rxp.s00853.us.wal-mart.com,rxp.s04836.us.wal-mart.com,rxp.s05925.us.wal-mart.com,rxp.s04989.us.wal-mart.com,rxp.s07254.us.wal-mart.com,rxp.s02232.us.wal-mart.com,rxp.s02163.us.wal-mart.com,rxp.s06330.us.wal-mart.com,rxp.s01134.us.wal-mart.com,rxp.s01996.us.wal-mart.com,rxp.s05817.us.wal-mart.com,rxp.s05831.us.wal-mart.com,rxp.s05845.us.wal-mart.com,rxp.s05264.us.wal-mart.com,rxp.s01173.us.wal-mart.com,rxp.s04690.us.wal-mart.com,rxp.s06937.us.wal-mart.com,rxp.s05758.us.wal-mart.com,rxp.s03538.us.wal-mart.com,rxp.s03348.us.wal-mart.com,rxp.s02796.us.wal-mart.com,rxp.s03877.us.wal-mart.com,rxp.s01444.us.wal-mart.com,rxp.s00174.us.wal-mart.com,rxp.s01087.us.wal-mart.com,rxp.s01847.us.wal-mart.com,rxp.s03347.us.wal-mart.com,rxp.s02944.us.wal-mart.com,rxp.s06149.us.wal-mart.com,rxp.s08120.us.wal-mart.com,rxp.s04782.us.wal-mart.com,rxp.s08138.us.wal-mart.com,rxp.s04972.us.wal-mart.com,rxp.s03066.us.wal-mart.com,rxp.s02499.us.wal-mart.com,rxp.s06894.us.wal-mart.com,rxp.s00459.us.wal-mart.com,rxp.s04739.us.wal-mart.com,rxp.s07245.us.wal-mart.com,rxp.s01121.us.wal-mart.com,rxp.s02754.us.wal-mart.com,rxp.s03485.us.wal-mart.com,rxp.s05010.us.wal-mart.com,rxp.s08166.us.wal-mart.com,rxp.s02935.us.wal-mart.com,rxp.s01683.us.wal-mart.com,rxp.s00886.us.wal-mart.com,rxp.s00810.us.wal-mart.com,rxp.s01496.us.wal-mart.com,rxp.s01509.us.wal-mart.com,rxp.s04973.us.wal-mart.com,rxp.s06328.us.wal-mart.com,rxp.s06487.us.wal-mart.com,rxp.s07266.us.wal-mart.com,rxp.s01356.us.wal-mart.com,rxp.s03851.us.wal-mart.com,rxp.s01655.us.wal-mart.com,rxp.s01676.us.wal-mart.com,rxp.s08135.us.wal-mart.com,rxp.s00655.us.wal-mart.com,rxp.s04524.us.wal-mart.com,rxp.s03610.us.wal-mart.com,rxp.s00696.us.wal-mart.com,rxp.s08276.us.wal-mart.com,rxp.s04387.us.wal-mart.com,rxp.s02435.us.wal-mart.com,rxp.s06434.us.wal-mart.com,rxp.s06655.us.wal-mart.com,rxp.s02869.us.wal-mart.com,rxp.s02700.us.wal-mart.com,rxp.s01923.us.wal-mart.com,rxp.s03458.us.wal-mart.com,rxp.s06510.us.wal-mart.com,rxp.s06311.us.wal-mart.com,rxp.s06427.us.wal-mart.com,rxp.s05292.us.wal-mart.com,rxp.s06789.us.wal-mart.com,rxp.s01312.us.wal-mart.com,rxp.s07235.us.wal-mart.com,rxp.s05063.us.wal-mart.com,rxp.s04484.us.wal-mart.com,rxp.s02749.us.wal-mart.com,rxp.s03612.us.wal-mart.com,rxp.s01321.us.wal-mart.com,rxp.s06573.us.wal-mart.com,rxp.s06540.us.wal-mart.com,rxp.s02758.us.wal-mart.com,rxp.s02399.us.wal-mart.com,rxp.s06386.us.wal-mart.com,rxp.s05414.us.wal-mart.com,rxp.s03078.us.wal-mart.com,rxp.s03422.us.wal-mart.com,rxp.s05944.us.wal-mart.com,rxp.s01940.us.wal-mart.com,rxp.s01731.us.wal-mart.com,rxp.s02092.us.wal-mart.com,rxp.s02043.us.wal-mart.com,rxp.s02120.us.wal-mart.com,rxp.s01781.us.wal-mart.com,rxp.s02093.us.wal-mart.com,rxp.s06366.us.wal-mart.com,rxp.s06440.us.wal-mart.com,rxp.s02073.us.wal-mart.com,rxp.s01857.us.wal-mart.com,rxp.s05184.us.wal-mart.com,rxp.s02362.us.wal-mart.com,rxp.s03206.us.wal-mart.com,rxp.s01622.us.wal-mart.com,rxp.s01448.us.wal-mart.com,rxp.s01986.us.wal-mart.com,rxp.s06302.us.wal-mart.com,rxp.s01739.us.wal-mart.com,rxp.s05040.us.wal-mart.com,rxp.s03738.us.wal-mart.com,rxp.s05103.us.wal-mart.com,rxp.s02597.us.wal-mart.com,rxp.s02540.us.wal-mart.com,rxp.s05379.us.wal-mart.com,rxp.s02611.us.wal-mart.com,rxp.s06675.us.wal-mart.com,rxp.s06575.us.wal-mart.com,rxp.s08175.us.wal-mart.com,rxp.s02240.us.wal-mart.com,rxp.s03713.us.wal-mart.com,rxp.s05923.us.wal-mart.com,rxp.s03899.us.wal-mart.com,rxp.s00511.us.wal-mart.com,rxp.s05251.us.wal-mart.com,rxp.s04482.us.wal-mart.com,rxp.s01159.us.wal-mart.com,rxp.s02065.us.wal-mart.com,rxp.s00620.us.wal-mart.com,rxp.s00335.us.wal-mart.com,rxp.s00684.us.wal-mart.com,rxp.s00678.us.wal-mart.com,rxp.s00741.us.wal-mart.com,rxp.s05182.us.wal-mart.com,rxp.s04514.us.wal-mart.com,rxp.s04258.us.wal-mart.com,rxp.s05755.us.wal-mart.com,rxp.s04220.us.wal-mart.com,rxp.s05253.us.wal-mart.com,rxp.s04636.us.wal-mart.com,rxp.s03243.us.wal-mart.com,rxp.s02647.us.wal-mart.com,rxp.s05488.us.wal-mart.com,rxp.s02705.us.wal-mart.com,rxp.s06524.us.wal-mart.com,rxp.s02530.us.wal-mart.com,rxp.s04156.us.wal-mart.com,rxp.s02828.us.wal-mart.com,rxp.s00882.us.wal-mart.com,rxp.s04281.us.wal-mart.com,rxp.s01776.us.wal-mart.com,rxp.s01316.us.wal-mart.com,rxp.s06321.us.wal-mart.com,rxp.s04840.us.wal-mart.com,rxp.s08167.us.wal-mart.com,rxp.s06324.us.wal-mart.com,rxp.s06331.us.wal-mart.com,rxp.s02576.us.wal-mart.com,rxp.s05296.us.wal-mart.com,rxp.s04278.us.wal-mart.com,rxp.s01499.us.wal-mart.com,rxp.s03583.us.wal-mart.com,rxp.s04771.us.wal-mart.com,rxp.s06354.us.wal-mart.com,rxp.s03803.us.wal-mart.com,rxp.s02166.us.wal-mart.com,rxp.s00766.us.wal-mart.com,rxp.s03782.us.wal-mart.com,rxp.s05393.us.wal-mart.com,rxp.s01314.us.wal-mart.com,rxp.s00941.us.wal-mart.com,rxp.s03247.us.wal-mart.com,rxp.s03389.us.wal-mart.com,rxp.s03367.us.wal-mart.com,rxp.s05254.us.wal-mart.com,rxp.s03074.us.wal-mart.com,rxp.s02890.us.wal-mart.com,rxp.s05298.us.wal-mart.com,rxp.s04616.us.wal-mart.com,rxp.s00937.us.wal-mart.com,rxp.s05815.us.wal-mart.com,rxp.s01227.us.wal-mart.com,rxp.s03182.us.wal-mart.com,rxp.s04145.us.wal-mart.com";
//        String s1="rxp.s00853.us.wal-mart.com,rxp.s04836.us.wal-mart.com,rxp.s05925.us.wal-mart.com,rxp.s04989.us.wal-mart.com,rxp.s07254.us.wal-mart.com,rxp.s02232.us.wal-mart.com,rxp.s02163.us.wal-mart.com,rxp.s06330.us.wal-mart.com,rxp.s01134.us.wal-mart.com,rxp.s01996.us.wal-mart.com,rxp.s05817.us.wal-mart.com,rxp.s05831.us.wal-mart.com,rxp.s05845.us.wal-mart.com,rxp.s05264.us.wal-mart.com,rxp.s01173.us.wal-mart.com,rxp.s04690.us.wal-mart.com,rxp.s06937.us.wal-mart.com,rxp.s05758.us.wal-mart.com,rxp.s03538.us.wal-mart.com,rxp.s03348.us.wal-mart.com,rxp.s02796.us.wal-mart.com,rxp.s03877.us.wal-mart.com,rxp.s01444.us.wal-mart.com,rxp.s00174.us.wal-mart.com,rxp.s01087.us.wal-mart.com,rxp.s01847.us.wal-mart.com,rxp.s03347.us.wal-mart.com,rxp.s02944.us.wal-mart.com,rxp.s06149.us.wal-mart.com,rxp.s08120.us.wal-mart.com,rxp.s04782.us.wal-mart.com,rxp.s08138.us.wal-mart.com,rxp.s04972.us.wal-mart.com,rxp.s03066.us.wal-mart.com,rxp.s02499.us.wal-mart.com,rxp.s06894.us.wal-mart.com,rxp.s00459.us.wal-mart.com,rxp.s04739.us.wal-mart.com,rxp.s07245.us.wal-mart.com,rxp.s01121.us.wal-mart.com,rxp.s02754.us.wal-mart.com,rxp.s03485.us.wal-mart.com,rxp.s05010.us.wal-mart.com,rxp.s08166.us.wal-mart.com,rxp.s02935.us.wal-mart.com,rxp.s01683.us.wal-mart.com,rxp.s00886.us.wal-mart.com,rxp.s00810.us.wal-mart.com,rxp.s01496.us.wal-mart.com,rxp.s01509.us.wal-mart.com,rxp.s04973.us.wal-mart.com,rxp.s06328.us.wal-mart.com,rxp.s06487.us.wal-mart.com,rxp.s07266.us.wal-mart.com,rxp.s01356.us.wal-mart.com,rxp.s03851.us.wal-mart.com,rxp.s01655.us.wal-mart.com,rxp.s01676.us.wal-mart.com,rxp.s08135.us.wal-mart.com,rxp.s00655.us.wal-mart.com,rxp.s04524.us.wal-mart.com,rxp.s03610.us.wal-mart.com,rxp.s00696.us.wal-mart.com,rxp.s08276.us.wal-mart.com,rxp.s04387.us.wal-mart.com,rxp.s02435.us.wal-mart.com,rxp.s06434.us.wal-mart.com,rxp.s06655.us.wal-mart.com,rxp.s02869.us.wal-mart.com,rxp.s02700.us.wal-mart.com,rxp.s01923.us.wal-mart.com,rxp.s03458.us.wal-mart.com,rxp.s06510.us.wal-mart.com,rxp.s06311.us.wal-mart.com,rxp.s06427.us.wal-mart.com,rxp.s05292.us.wal-mart.com,rxp.s06789.us.wal-mart.com,rxp.s01312.us.wal-mart.com,rxp.s07235.us.wal-mart.com,rxp.s04574.us.wal-mart.com,rxp.s05063.us.wal-mart.com,rxp.s04484.us.wal-mart.com,rxp.s02749.us.wal-mart.com,rxp.s03612.us.wal-mart.com,rxp.s01321.us.wal-mart.com,rxp.s06573.us.wal-mart.com,rxp.s06540.us.wal-mart.com,rxp.s02758.us.wal-mart.com,rxp.s02399.us.wal-mart.com,rxp.s06386.us.wal-mart.com,rxp.s05414.us.wal-mart.com,rxp.s03078.us.wal-mart.com,rxp.s03422.us.wal-mart.com,rxp.s05944.us.wal-mart.com,rxp.s01940.us.wal-mart.com,rxp.s01731.us.wal-mart.com,rxp.s02092.us.wal-mart.com,rxp.s02043.us.wal-mart.com,rxp.s02120.us.wal-mart.com,rxp.s01781.us.wal-mart.com,rxp.s02093.us.wal-mart.com,rxp.s06366.us.wal-mart.com,rxp.s06440.us.wal-mart.com,rxp.s02073.us.wal-mart.com,rxp.s01857.us.wal-mart.com,rxp.s05184.us.wal-mart.com,rxp.s02362.us.wal-mart.com,rxp.s03206.us.wal-mart.com,rxp.s01622.us.wal-mart.com,rxp.s01448.us.wal-mart.com,rxp.s01986.us.wal-mart.com,rxp.s06302.us.wal-mart.com,rxp.s01739.us.wal-mart.com,rxp.s05040.us.wal-mart.com,rxp.s03738.us.wal-mart.com,rxp.s05103.us.wal-mart.com,rxp.s02597.us.wal-mart.com,rxp.s02540.us.wal-mart.com,rxp.s05379.us.wal-mart.com,rxp.s02611.us.wal-mart.com,rxp.s06675.us.wal-mart.com,rxp.s06575.us.wal-mart.com,rxp.s08175.us.wal-mart.com,rxp.s02240.us.wal-mart.com,rxp.s03713.us.wal-mart.com,rxp.s05923.us.wal-mart.com,rxp.s03899.us.wal-mart.com,rxp.s00511.us.wal-mart.com,rxp.s05251.us.wal-mart.com,rxp.s04482.us.wal-mart.com,rxp.s01159.us.wal-mart.com,rxp.s02065.us.wal-mart.com,rxp.s00620.us.wal-mart.com,rxp.s00335.us.wal-mart.com,rxp.s00684.us.wal-mart.com,rxp.s00678.us.wal-mart.com,rxp.s00741.us.wal-mart.com,rxp.s05182.us.wal-mart.com,rxp.s04514.us.wal-mart.com,rxp.s04258.us.wal-mart.com,rxp.s05755.us.wal-mart.com,rxp.s04220.us.wal-mart.com,rxp.s05253.us.wal-mart.com,rxp.s04636.us.wal-mart.com,rxp.s03243.us.wal-mart.com,rxp.s02647.us.wal-mart.com,rxp.s05488.us.wal-mart.com,rxp.s02705.us.wal-mart.com,rxp.s06524.us.wal-mart.com,rxp.s02530.us.wal-mart.com,rxp.s04156.us.wal-mart.com,rxp.s02828.us.wal-mart.com,rxp.s00882.us.wal-mart.com,rxp.s04281.us.wal-mart.com,rxp.s01776.us.wal-mart.com,rxp.s01316.us.wal-mart.com,rxp.s06321.us.wal-mart.com,rxp.s04840.us.wal-mart.com,rxp.s08167.us.wal-mart.com,rxp.s06324.us.wal-mart.com,rxp.s06331.us.wal-mart.com,rxp.s02576.us.wal-mart.com,rxp.s05296.us.wal-mart.com,rxp.s04278.us.wal-mart.com,rxp.s01499.us.wal-mart.com,rxp.s03583.us.wal-mart.com,rxp.s04771.us.wal-mart.com,rxp.s06354.us.wal-mart.com,rxp.s03803.us.wal-mart.com,rxp.s02166.us.wal-mart.com,rxp.s00766.us.wal-mart.com,rxp.s03782.us.wal-mart.com,rxp.s05393.us.wal-mart.com,rxp.s01314.us.wal-mart.com,rxp.s00941.us.wal-mart.com,rxp.s03247.us.wal-mart.com,rxp.s03389.us.wal-mart.com,rxp.s03367.us.wal-mart.com,rxp.s05254.us.wal-mart.com,rxp.s03074.us.wal-mart.com,rxp.s02890.us.wal-mart.com,rxp.s05298.us.wal-mart.com,rxp.s04616.us.wal-mart.com,rxp.s00937.us.wal-mart.com,rxp.s05815.us.wal-mart.com,rxp.s01227.us.wal-mart.com,rxp.s03182.us.wal-mart.com,rxp.s04145.us.wal-mart.com";
        String s1="rxp.s00853.us.wal-mart.com,rxp.s04836.us.wal-mart.com,rxp.s05925.us.wal-mart.com,rxp.s04989.us.wal-mart.com,rxp.s07254.us.wal-mart.com,rxp.s02232.us.wal-mart.com,rxp.s02163.us.wal-mart.com,rxp.s06330.us.wal-mart.com,rxp.s01134.us.wal-mart.com,rxp.s01996.us.wal-mart.com,rxp.s05817.us.wal-mart.com,rxp.s05831.us.wal-mart.com,rxp.s05845.us.wal-mart.com,rxp.s05264.us.wal-mart.com,rxp.s01173.us.wal-mart.com,rxp.s04690.us.wal-mart.com,rxp.s06937.us.wal-mart.com,rxp.s05758.us.wal-mart.com,rxp.s03538.us.wal-mart.com,rxp.s03348.us.wal-mart.com,rxp.s02796.us.wal-mart.com,rxp.s03877.us.wal-mart.com,rxp.s01444.us.wal-mart.com,rxp.s00174.us.wal-mart.com,rxp.s01087.us.wal-mart.com,rxp.s01847.us.wal-mart.com,rxp.s03347.us.wal-mart.com,rxp.s02944.us.wal-mart.com,rxp.s06149.us.wal-mart.com,rxp.s08120.us.wal-mart.com,rxp.s04782.us.wal-mart.com,rxp.s08138.us.wal-mart.com,rxp.s04972.us.wal-mart.com,rxp.s03066.us.wal-mart.com,rxp.s02499.us.wal-mart.com,rxp.s06894.us.wal-mart.com,rxp.s00459.us.wal-mart.com,rxp.s04739.us.wal-mart.com,rxp.s07245.us.wal-mart.com,rxp.s01121.us.wal-mart.com,rxp.s02754.us.wal-mart.com,rxp.s03485.us.wal-mart.com,rxp.s05010.us.wal-mart.com,rxp.s08166.us.wal-mart.com,rxp.s00647.us.wal-mart.com,rxp.s02935.us.wal-mart.com,rxp.s01683.us.wal-mart.com,rxp.s00886.us.wal-mart.com,rxp.s00810.us.wal-mart.com,rxp.s01496.us.wal-mart.com,rxp.s01509.us.wal-mart.com,rxp.s04973.us.wal-mart.com,rxp.s06328.us.wal-mart.com,rxp.s06487.us.wal-mart.com,rxp.s07266.us.wal-mart.com,rxp.s01356.us.wal-mart.com,rxp.s03851.us.wal-mart.com,rxp.s01655.us.wal-mart.com,rxp.s01676.us.wal-mart.com,rxp.s08135.us.wal-mart.com,rxp.s00655.us.wal-mart.com,rxp.s04524.us.wal-mart.com,rxp.s03610.us.wal-mart.com,rxp.s00696.us.wal-mart.com,rxp.s08276.us.wal-mart.com,rxp.s04387.us.wal-mart.com,rxp.s02435.us.wal-mart.com,rxp.s06434.us.wal-mart.com,rxp.s06655.us.wal-mart.com,rxp.s02869.us.wal-mart.com,rxp.s02700.us.wal-mart.com,rxp.s01923.us.wal-mart.com,rxp.s03458.us.wal-mart.com,rxp.s06510.us.wal-mart.com,rxp.s06311.us.wal-mart.com,rxp.s06427.us.wal-mart.com,rxp.s05292.us.wal-mart.com,rxp.s07217.us.wal-mart.com,rxp.s06789.us.wal-mart.com,rxp.s01312.us.wal-mart.com,rxp.s07235.us.wal-mart.com,rxp.s04574.us.wal-mart.com,rxp.s05063.us.wal-mart.com,rxp.s04484.us.wal-mart.com,rxp.s02749.us.wal-mart.com,rxp.s03612.us.wal-mart.com,rxp.s01321.us.wal-mart.com,rxp.s06573.us.wal-mart.com,rxp.s06540.us.wal-mart.com,rxp.s02758.us.wal-mart.com,rxp.s02399.us.wal-mart.com,rxp.s06386.us.wal-mart.com,rxp.s05414.us.wal-mart.com,rxp.s03078.us.wal-mart.com,rxp.s02171.us.wal-mart.com,rxp.s03422.us.wal-mart.com,rxp.s05944.us.wal-mart.com,rxp.s01940.us.wal-mart.com,rxp.s01731.us.wal-mart.com,rxp.s02092.us.wal-mart.com,rxp.s02043.us.wal-mart.com,rxp.s02120.us.wal-mart.com,rxp.s01781.us.wal-mart.com,rxp.s02093.us.wal-mart.com,rxp.s06366.us.wal-mart.com,rxp.s06440.us.wal-mart.com,rxp.s02073.us.wal-mart.com,rxp.s01857.us.wal-mart.com,rxp.s05184.us.wal-mart.com,rxp.s02362.us.wal-mart.com,rxp.s03206.us.wal-mart.com,rxp.s01622.us.wal-mart.com,rxp.s01448.us.wal-mart.com,rxp.s01986.us.wal-mart.com,rxp.s06302.us.wal-mart.com,rxp.s01739.us.wal-mart.com,rxp.s05040.us.wal-mart.com,rxp.s03738.us.wal-mart.com,rxp.s05103.us.wal-mart.com,rxp.s02597.us.wal-mart.com,rxp.s02540.us.wal-mart.com,rxp.s05379.us.wal-mart.com,rxp.s02611.us.wal-mart.com,rxp.s06675.us.wal-mart.com,rxp.s06575.us.wal-mart.com,rxp.s08175.us.wal-mart.com,rxp.s02240.us.wal-mart.com,rxp.s03713.us.wal-mart.com,rxp.s05923.us.wal-mart.com,rxp.s03899.us.wal-mart.com,rxp.s00511.us.wal-mart.com,rxp.s05251.us.wal-mart.com,rxp.s04482.us.wal-mart.com,rxp.s01159.us.wal-mart.com,rxp.s02065.us.wal-mart.com,rxp.s00620.us.wal-mart.com,rxp.s00335.us.wal-mart.com,rxp.s00684.us.wal-mart.com,rxp.s00678.us.wal-mart.com,rxp.s00741.us.wal-mart.com,rxp.s05182.us.wal-mart.com,rxp.s04514.us.wal-mart.com,rxp.s04258.us.wal-mart.com,rxp.s05755.us.wal-mart.com,rxp.s04220.us.wal-mart.com,rxp.s05253.us.wal-mart.com,rxp.s04636.us.wal-mart.com,rxp.s03243.us.wal-mart.com,rxp.s02647.us.wal-mart.com,rxp.s05488.us.wal-mart.com,rxp.s02705.us.wal-mart.com,rxp.s06524.us.wal-mart.com,rxp.s02530.us.wal-mart.com,rxp.s04156.us.wal-mart.com,rxp.s02828.us.wal-mart.com,rxp.s00882.us.wal-mart.com,rxp.s04281.us.wal-mart.com,rxp.s01776.us.wal-mart.com,rxp.s01316.us.wal-mart.com,rxp.s06321.us.wal-mart.com,rxp.s04840.us.wal-mart.com,rxp.s08167.us.wal-mart.com,rxp.s06324.us.wal-mart.com,rxp.s06331.us.wal-mart.com,rxp.s02576.us.wal-mart.com,rxp.s05296.us.wal-mart.com,rxp.s04278.us.wal-mart.com,rxp.s01499.us.wal-mart.com,rxp.s03583.us.wal-mart.com,rxp.s04771.us.wal-mart.com,rxp.s06354.us.wal-mart.com,rxp.s03803.us.wal-mart.com,rxp.s02166.us.wal-mart.com,rxp.s00766.us.wal-mart.com,rxp.s03782.us.wal-mart.com,rxp.s05393.us.wal-mart.com,rxp.s01314.us.wal-mart.com,rxp.s00941.us.wal-mart.com,rxp.s03247.us.wal-mart.com,rxp.s03389.us.wal-mart.com,rxp.s03367.us.wal-mart.com,rxp.s05254.us.wal-mart.com,rxp.s03074.us.wal-mart.com,rxp.s02890.us.wal-mart.com,rxp.s05298.us.wal-mart.com,rxp.s04616.us.wal-mart.com,rxp.s00937.us.wal-mart.com,rxp.s05815.us.wal-mart.com,rxp.s01227.us.wal-mart.com,rxp.s03182.us.wal-mart.com,rxp.s04145.us.wal-mart.com";
        String[] ar1=s.split(",");
        String[] ar2=s1.split(",");
        System.out.println(ar1.length +" "+ar2.length);
        Set<String> sets = new HashSet<>(Arrays.asList(ar2));
        for(String a: ar1){
            sets.remove(a);
        }
        System.out.println(sets);

        Timestamp t=Timestamp.from(Instant.from(Instant.now()));
    }
}