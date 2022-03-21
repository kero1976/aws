package domain.repositories;

public interface IS3GetRepository {

	/**
	 * S3からデータをデータをbyte[]で取得する.
	 * @param bucketName バケット名
	 * @param keyName キー名
	 * @return データ
	 */
	byte[] GetBytes(String bucketName, String keyName);
}
