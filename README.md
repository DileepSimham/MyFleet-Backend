Root Cause Analysis (RCA)
Issue: Missing Query Parameters
While calling the API, certain parameters were received as null, specifically mndFlag, ucFlag, mwhFlag, and contractNumber.

Root Cause: Reserved Character in URL
The problem stemmed from using the # symbol in the siteName parameter. This character is reserved for fragment identifiers in URLs, which means anything after # is ignored by the browser. Therefore, only part of the expected query was sent to the server.

Solution: Properly Encode URL
To resolve the issue, I encoded the # symbol as %23 in the URL. This way, the browser sends the entire parameter correctly.
