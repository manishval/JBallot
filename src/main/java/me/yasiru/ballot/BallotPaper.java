package me.yasiru.ballot;

import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.Rect;
import org.opencv.core.RotatedRect;
import org.opencv.imgcodecs.Imgcodecs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wik2kassa on 11/29/2016.
 */
public class BallotPaper extends Mat {
    private Rect partyVoteArea;
    private Rect prefVoteArea;
    private List<MatOfPoint> externalContours;
    private Mat externalContoursList;
    private List<Rect> voteBoxes;
    private Rect votedPartyBox;
    private boolean isValidVote;
    private String filename;
    private int[] prefVoteInkCount;
    public BallotPaper() {
        super();
        partyVoteArea = new Rect();
        prefVoteArea = new Rect();

        externalContoursList = new Mat();
        externalContours = new ArrayList<MatOfPoint>();

        isValidVote = false;
        prefVoteInkCount = new int[40];
    }

    public static BallotPaper loadFromFile(String file) {
        BallotPaper ballotPaper = (BallotPaper) Imgcodecs.imread(file);
        ballotPaper.filename = file;
        return ballotPaper;
    }

    public Rect getPartyVoteArea() {
        return partyVoteArea;
    }

    public void setPartyVoteArea(Rect partyVoteArea) {
        this.partyVoteArea = partyVoteArea;
    }

    public Rect getPrefVoteArea() {
        return prefVoteArea;
    }

    public void setPrefVoteArea(Rect prefVoteArea) {
        this.prefVoteArea = prefVoteArea;
    }

    public List<MatOfPoint> getExternalContours() {
        return externalContours;
    }

    public void setExternalContours(List<MatOfPoint> externalContours) {
        this.externalContours = externalContours;
    }

    public List<Rect> getVoteBoxes() {
        return voteBoxes;
    }

    public void setVoteBoxes(List<Rect> voteBoxes) {
        this.voteBoxes = voteBoxes;
    }

    public Rect getVotedPartyBox() {
        return votedPartyBox;
    }

    public void setVotedPartyBox(Rect votedPartyBox) {
        this.votedPartyBox = votedPartyBox;
    }

    public boolean isValidVote() {
        return isValidVote;
    }

    public void setValidVote(boolean validVote) {
        isValidVote = validVote;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int[] getPrefVoteInkCount() {
        return prefVoteInkCount;
    }

    public void setPrefVoteInkCount(int[] prefVoteInkCount) {
        this.prefVoteInkCount = prefVoteInkCount;
    }

    public Mat getExternalContoursList() {
        return externalContoursList;
    }

    public void setExternalContoursList(Mat externalContoursList) {
        this.externalContoursList = externalContoursList;
    }
}
