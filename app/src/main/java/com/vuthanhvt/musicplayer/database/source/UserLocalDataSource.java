package com.vuthanhvt.musicplayer.database.source;

/**
 * Create by FRAMGIA\vu.anh.thanh on 02/11/2018.
 * Phone: 096.320.8650
 * Email: vuthanhvt@gmail.com
 * <p>
 * Class UserLocalDataSource.
 */
public class UserLocalDataSource implements IUserLocalDataSource {

    private static UserLocalDataSource mInstance = new UserLocalDataSource();

    private UserLocalDataSource() {
    }

    public static UserLocalDataSource getInstance() {
        return mInstance;
    }
}
