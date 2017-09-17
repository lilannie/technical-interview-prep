package technicalProblems.arrays;

public class MedianOfTwoArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int length = n + m;
        boolean isEven = length % 2 == 0;
        int medianIndex = isEven ? (length / 2)-1 : (length / 2);

        if (length == 0) {
            return 0.0;
        }
        if (n == 0) {
            return isEven ? ((double)nums2[medianIndex] + (double)nums2[medianIndex+1])/2 : nums2[medianIndex];
        }
        if (m == 0) {
            return isEven ? ((double)nums1[medianIndex] + (double)nums1[medianIndex+1])/2 : nums1[medianIndex];
        }

        int nIndex = 0;
        int mIndex = 0;
        int medianElement = 0;
        for (int i = 0; i <= medianIndex; i++) {
            if (nIndex >= n) {
                medianElement = nums2[mIndex];
                mIndex++;
            }
            else if (mIndex >= m) {
                medianElement = nums1[nIndex];
                nIndex++;
            }
            else {
                if (nums1[nIndex] <= nums2[mIndex]) {
                    medianElement = nums1[nIndex];
                    nIndex++;
                }
                else {
                    medianElement = nums2[mIndex];
                    mIndex++;
                }
            }
        }

        if (isEven) {
            if (nIndex >= n) {
                return ((double)medianElement + (double)nums2[mIndex])/2;
            }
            else if (mIndex >= m) {
                return ((double)medianElement + (double)nums1[nIndex])/2;
            }
            else {
                if (nums1[nIndex] <= nums2[mIndex]) {
                    return ((double)medianElement + (double)nums1[nIndex])/2;
                }
                return ((double)medianElement + (double)nums2[mIndex])/2;
            }
        }

        return (double) medianElement;
    }

}
