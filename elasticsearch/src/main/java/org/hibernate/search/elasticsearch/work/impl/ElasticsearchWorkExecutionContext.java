/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.elasticsearch.work.impl;

import org.hibernate.search.backend.IndexingMonitor;
import org.hibernate.search.elasticsearch.client.impl.JestClient;
import org.hibernate.search.elasticsearch.impl.GsonService;

/**
 * @author Yoann Rodiere
 */
public interface ElasticsearchWorkExecutionContext {

	JestClient getClient();

	GsonService getGsonService();

	void setIndexDirty(String indexName);

	IndexingMonitor getBufferedIndexingMonitor(IndexingMonitor indexingMonitor);

}