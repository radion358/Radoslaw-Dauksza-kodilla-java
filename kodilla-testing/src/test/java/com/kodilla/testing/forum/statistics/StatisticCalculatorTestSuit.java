package com.kodilla.testing.forum.statistics;

import org.junit.*;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticCalculatorTestSuit {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void calculateAdvStatisticsTestCase0Post() {
        //Given
        int testNumberOfPosts = 0;
        int testNumberOfComments = 4;
        List<String> userNamesList = new ArrayList<>();
        userNamesList.add("abc");
        userNamesList.add("cab");
        int testNumberOfUsers = userNamesList.size();
        Statistics statisticMock = mock(Statistics.class);
        StatisticCalculator calculator = new StatisticCalculator();

        when(statisticMock.usersNames()).thenReturn(userNamesList);
        when(statisticMock.postsCount()).thenReturn(testNumberOfPosts);
        when(statisticMock.commentsCount()).thenReturn(testNumberOfComments);

        //When
        calculator.calculateAdvStatistics(statisticMock);
        int numberOfUsers = calculator.getNumberOfUsers();
        int numberOfPosts = calculator.getNumberOfPosts();
        int numberOfComment = calculator.getNumberOfComment();
        double averageNumberOfPostPerUser = calculator.getAverageNumberOfPostPerUser();
        double averageNumberOfCommentPerUser = calculator.getAverageNumberOfCommentPerUser();
        double averageNumberOfCommentPerPost = calculator.getAverageNumberOfCommentPerPost();

        //Then
        Assert.assertEquals(testNumberOfUsers, numberOfUsers);
        Assert.assertEquals(testNumberOfPosts, numberOfPosts);
        Assert.assertEquals(testNumberOfComments, numberOfComment);
        Assert.assertEquals(2, averageNumberOfCommentPerUser, 0.0001);
        Assert.assertEquals(0, averageNumberOfPostPerUser, 0.0001);
        Assert.assertEquals(0, averageNumberOfCommentPerPost, 0.0001);
    }

    @Test
    public void calculateAdvStatisticsTestCase1000Post() {
        //Given
        int testNumberOfPosts = 1000;
        int testNumberOfComments = 4;
        List<String> userNamesList = new ArrayList<>();
        userNamesList.add("abc");
        userNamesList.add("cab");
        int testNumberOfUsers = userNamesList.size();
        Statistics statisticMock = mock(Statistics.class);
        StatisticCalculator calculator = new StatisticCalculator();

        when(statisticMock.usersNames()).thenReturn(userNamesList);
        when(statisticMock.postsCount()).thenReturn(testNumberOfPosts);
        when(statisticMock.commentsCount()).thenReturn(testNumberOfComments);

        //When
        calculator.calculateAdvStatistics(statisticMock);
        int numberOfUsers = calculator.getNumberOfUsers();
        int numberOfPosts = calculator.getNumberOfPosts();
        int numberOfComment = calculator.getNumberOfComment();
        double averageNumberOfPostPerUser = calculator.getAverageNumberOfPostPerUser();
        double averageNumberOfCommentPerUser = calculator.getAverageNumberOfCommentPerUser();
        double averageNumberOfCommentPerPost = calculator.getAverageNumberOfCommentPerPost();

        //Then
        Assert.assertEquals(testNumberOfUsers, numberOfUsers);
        Assert.assertEquals(testNumberOfPosts, numberOfPosts);
        Assert.assertEquals(testNumberOfComments, numberOfComment);
        Assert.assertEquals(2, averageNumberOfCommentPerUser, 0.0001);
        Assert.assertEquals(500, averageNumberOfPostPerUser, 0.0001);
        Assert.assertEquals(0.004, averageNumberOfCommentPerPost, 0.0001);
    }

    @Test
    public void calculateAdvStatisticsTestCase0Comment() {
        //Given
        int testNumberOfPosts = 100;
        int testNumberOfComments = 0;
        List<String> userNamesList = new ArrayList<>();
        userNamesList.add("abc");
        userNamesList.add("cab");
        int testNumberOfUsers = userNamesList.size();
        Statistics statisticMock = mock(Statistics.class);
        StatisticCalculator calculator = new StatisticCalculator();

        when(statisticMock.usersNames()).thenReturn(userNamesList);
        when(statisticMock.postsCount()).thenReturn(testNumberOfPosts);
        when(statisticMock.commentsCount()).thenReturn(testNumberOfComments);

        //When
        calculator.calculateAdvStatistics(statisticMock);
        int numberOfUsers = calculator.getNumberOfUsers();
        int numberOfPosts = calculator.getNumberOfPosts();
        int numberOfComment = calculator.getNumberOfComment();
        double averageNumberOfPostPerUser = calculator.getAverageNumberOfPostPerUser();
        double averageNumberOfCommentPerUser = calculator.getAverageNumberOfCommentPerUser();
        double averageNumberOfCommentPerPost = calculator.getAverageNumberOfCommentPerPost();

        //Then
        Assert.assertEquals(testNumberOfUsers, numberOfUsers);
        Assert.assertEquals(testNumberOfPosts, numberOfPosts);
        Assert.assertEquals(testNumberOfComments, numberOfComment);
        Assert.assertEquals(0, averageNumberOfCommentPerUser, 0.0001);
        Assert.assertEquals(50, averageNumberOfPostPerUser, 0.0001);
        Assert.assertEquals(0, averageNumberOfCommentPerPost, 0.0001);
    }

    @Test
    public void calculateAdvStatisticsTestCaseLessCommentThanPost() {
        //Given
        int testNumberOfPosts = 100;
        int testNumberOfComments = 50;
        List<String> userNamesList = new ArrayList<>();
        userNamesList.add("abc");
        userNamesList.add("cab");
        int testNumberOfUsers = userNamesList.size();
        Statistics statisticMock = mock(Statistics.class);
        StatisticCalculator calculator = new StatisticCalculator();

        when(statisticMock.usersNames()).thenReturn(userNamesList);
        when(statisticMock.postsCount()).thenReturn(testNumberOfPosts);
        when(statisticMock.commentsCount()).thenReturn(testNumberOfComments);

        //When
        calculator.calculateAdvStatistics(statisticMock);
        int numberOfUsers = calculator.getNumberOfUsers();
        int numberOfPosts = calculator.getNumberOfPosts();
        int numberOfComment = calculator.getNumberOfComment();
        double averageNumberOfPostPerUser = calculator.getAverageNumberOfPostPerUser();
        double averageNumberOfCommentPerUser = calculator.getAverageNumberOfCommentPerUser();
        double averageNumberOfCommentPerPost = calculator.getAverageNumberOfCommentPerPost();

        //Then
        Assert.assertEquals(testNumberOfUsers, numberOfUsers);
        Assert.assertEquals(testNumberOfPosts, numberOfPosts);
        Assert.assertEquals(testNumberOfComments, numberOfComment);
        Assert.assertEquals(25, averageNumberOfCommentPerUser, 0.0001);
        Assert.assertEquals(50, averageNumberOfPostPerUser, 0.0001);
        Assert.assertEquals(0.5, averageNumberOfCommentPerPost, 0.0001);
    }

    @Test
    public void calculateAdvStatisticsTestCaseMoreCommentThanPost() {
        //Given
        int testNumberOfPosts = 100;
        int testNumberOfComments = 300;
        List<String> userNamesList = new ArrayList<>();
        userNamesList.add("abc");
        userNamesList.add("cab");
        int testNumberOfUsers = userNamesList.size();
        Statistics statisticMock = mock(Statistics.class);
        StatisticCalculator calculator = new StatisticCalculator();

        when(statisticMock.usersNames()).thenReturn(userNamesList);
        when(statisticMock.postsCount()).thenReturn(testNumberOfPosts);
        when(statisticMock.commentsCount()).thenReturn(testNumberOfComments);

        //When
        calculator.calculateAdvStatistics(statisticMock);
        int numberOfUsers = calculator.getNumberOfUsers();
        int numberOfPosts = calculator.getNumberOfPosts();
        int numberOfComment = calculator.getNumberOfComment();
        double averageNumberOfPostPerUser = calculator.getAverageNumberOfPostPerUser();
        double averageNumberOfCommentPerUser = calculator.getAverageNumberOfCommentPerUser();
        double averageNumberOfCommentPerPost = calculator.getAverageNumberOfCommentPerPost();

        //Then
        Assert.assertEquals(testNumberOfUsers, numberOfUsers);
        Assert.assertEquals(testNumberOfPosts, numberOfPosts);
        Assert.assertEquals(testNumberOfComments, numberOfComment);
        Assert.assertEquals(150, averageNumberOfCommentPerUser, 0.0001);
        Assert.assertEquals(50, averageNumberOfPostPerUser, 0.0001);
        Assert.assertEquals(3, averageNumberOfCommentPerPost, 0.0001);
    }

    @Test
    public void calculateAdvStatisticsTestCase0Users() {
        //Given
        int testNumberOfPosts = 100;
        int testNumberOfComments = 4;
        List<String> userNamesList = new ArrayList<>();
        int testNumberOfUsers = userNamesList.size();
        Statistics statisticMock = mock(Statistics.class);
        StatisticCalculator calculator = new StatisticCalculator();

        when(statisticMock.usersNames()).thenReturn(userNamesList);
        when(statisticMock.postsCount()).thenReturn(testNumberOfPosts);
        when(statisticMock.commentsCount()).thenReturn(testNumberOfComments);

        //When
        calculator.calculateAdvStatistics(statisticMock);
        int numberOfUsers = calculator.getNumberOfUsers();
        int numberOfPosts = calculator.getNumberOfPosts();
        int numberOfComment = calculator.getNumberOfComment();
        double averageNumberOfPostPerUser = calculator.getAverageNumberOfPostPerUser();
        double averageNumberOfCommentPerUser = calculator.getAverageNumberOfCommentPerUser();
        double averageNumberOfCommentPerPost = calculator.getAverageNumberOfCommentPerPost();

        //Then
        Assert.assertEquals(testNumberOfUsers, numberOfUsers);
        Assert.assertEquals(testNumberOfPosts, numberOfPosts);
        Assert.assertEquals(testNumberOfComments, numberOfComment);
        Assert.assertEquals(0, averageNumberOfCommentPerUser, 0.0001);
        Assert.assertEquals(0, averageNumberOfPostPerUser, 0.0001);
        Assert.assertEquals(0.04, averageNumberOfCommentPerPost, 0.0001);
    }

    @Test
    public void calculateAdvStatisticsTestCase100Users() {
        //Given
        int testNumberOfPosts = 100;
        int testNumberOfComments = 4;
        List<String> list = new ArrayList<>();
        List<String> spyList = Mockito.spy(list);

        Mockito.doReturn(100).when(spyList).size();
        int testNumberOfUsers = spyList.size();
        Statistics statisticMock = mock(Statistics.class);
        StatisticCalculator calculator = new StatisticCalculator();

        when(statisticMock.usersNames()).thenReturn(spyList);
        when(statisticMock.postsCount()).thenReturn(testNumberOfPosts);
        when(statisticMock.commentsCount()).thenReturn(testNumberOfComments);

        //When
        calculator.calculateAdvStatistics(statisticMock);
        int numberOfUsers = calculator.getNumberOfUsers();
        int numberOfPosts = calculator.getNumberOfPosts();
        int numberOfComment = calculator.getNumberOfComment();
        double averageNumberOfPostPerUser = calculator.getAverageNumberOfPostPerUser();
        double averageNumberOfCommentPerUser = calculator.getAverageNumberOfCommentPerUser();
        double averageNumberOfCommentPerPost = calculator.getAverageNumberOfCommentPerPost();

        //Then
        Assert.assertEquals(testNumberOfUsers, numberOfUsers);
        Assert.assertEquals(testNumberOfPosts, numberOfPosts);
        Assert.assertEquals(testNumberOfComments, numberOfComment);
        Assert.assertEquals(0.04, averageNumberOfCommentPerUser, 0.0001);
        Assert.assertEquals(1, averageNumberOfPostPerUser, 0.0001);
        Assert.assertEquals(0.04, averageNumberOfCommentPerPost, 0.0001);
    }
}
