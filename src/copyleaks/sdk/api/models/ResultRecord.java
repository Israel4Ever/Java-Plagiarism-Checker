/********************************************************************************
 The MIT License(MIT)
 
 Copyright(c) 2016 Copyleaks LTD (https://copyleaks.com)
 
 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:
 
 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.
 
 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
********************************************************************************/

package copyleaks.sdk.api.models;

import com.google.gson.annotations.SerializedName;

public class ResultRecord implements Comparable<ResultRecord>
{
	public ResultRecord(String URL, int Percents, int NumberOfCopiedWords){
		this.URL = URL;
		this.Percents = Percents;
		this.NumberOfCopiedWords = NumberOfCopiedWords;
	}
	
	public ResultRecord(){
		// For serialization.
	}
	
	@SerializedName("URL")
	private String URL;

	public String getURL()
	{
		return URL;
	}

	@SerializedName("Percents")
	private int Percents;

	public int getPercents()
	{
		return Percents;
	}

	@SerializedName("NumberOfCopiedWords")

	private int NumberOfCopiedWords;

	public int getNumberOfCopiedWords()
	{
		return NumberOfCopiedWords;
	}
	
	@Override
	public int compareTo(ResultRecord o) {
		return Integer.compare(this.getPercents(), o.getPercents());
    }
}
