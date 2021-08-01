#include <gtest/gtest.h>
#include <writejsonfile.h>

int Add(int a, int b)
{
	return a + b;
}

TEST(test, test)
{
	writejsonfile(NULL);
	EXPECT_EQ(Add(1, 2), 3);
	ASSERT_EQ(Add(2, 3), 5);
}

